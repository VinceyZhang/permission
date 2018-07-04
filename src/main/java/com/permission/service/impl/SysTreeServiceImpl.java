package com.permission.service.impl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.permission.dao.SysDeptMapper;
import com.permission.dto.DeptLevelDto;
import com.permission.model.SysDept;
import com.permission.service.SysDeptService;
import com.permission.service.SysTreeService;
import com.permission.util.LevelUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class SysTreeServiceImpl implements SysTreeService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<DeptLevelDto> deptTree() {
        List<SysDept> deptList =sysDeptMapper.getAllDept();

        List<DeptLevelDto> dtoList = Lists.newArrayList();

        for (SysDept dept : deptList) {
            DeptLevelDto dto = DeptLevelDto.adapt(dept);
            dtoList.add(dto);
        }
        return deptListToTree(dtoList);
    }

    @Override
    public List<DeptLevelDto> deptListToTree(List<DeptLevelDto> deptLevelDtoList) {

        if (CollectionUtils.isEmpty(deptLevelDtoList)) {
            return Lists.newArrayList();
        }

        Multimap<String, DeptLevelDto> levelDeptMap = ArrayListMultimap.create();
        List<DeptLevelDto> rootList = Lists.newArrayList();

        for (DeptLevelDto dto : deptLevelDtoList) {
            levelDeptMap.put(dto.getLevel(), dto);
            if (LevelUtil.ROOT.equals(dto.getLevel())) {
                rootList.add(dto);
            }
        }

        //按照seq从小到大排列
        Collections.sort(rootList, new Comparator<DeptLevelDto>() {
            @Override
            public int compare(DeptLevelDto o1, DeptLevelDto o2) {
                return o1.getSeq() - o2.getSeq();
            }

        });
        //递归生成树
        transformDeptTree(deptLevelDtoList, LevelUtil.ROOT, levelDeptMap);
        return rootList;

    }

    private void transformDeptTree(List<DeptLevelDto> deptLevelDtoList, String level, Multimap<String, DeptLevelDto> levelDeptMap) {

        for (int i = 0; i < deptLevelDtoList.size(); i++) {
            //遍历该层每个元素
            DeptLevelDto deptLevelDto = deptLevelDtoList.get(i);
            //处理当前层级的数据
            String nextLevel = LevelUtil.calculateLevel(level, deptLevelDto.getId());
            //处理下一层
            List<DeptLevelDto> tempDeptList = (List<DeptLevelDto>) levelDeptMap.get(nextLevel);
            if (CollectionUtils.isNotEmpty(tempDeptList)) {
                //排序
                Collections.sort(tempDeptList, deptLevelDtoComparator);
                //设置下一部门
                deptLevelDto.setDeptList(deptLevelDtoList);
                //进入下一级
                transformDeptTree(deptLevelDtoList, nextLevel, levelDeptMap);

            }
        }
    }

    public Comparator<DeptLevelDto> deptLevelDtoComparator = new Comparator<DeptLevelDto>() {
        @Override
        public int compare(DeptLevelDto o1, DeptLevelDto o2) {
            return o1.getSeq() - o2.getSeq();
        }
    };
}
