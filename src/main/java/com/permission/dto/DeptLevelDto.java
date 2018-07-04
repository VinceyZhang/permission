package com.permission.dto;

import com.google.common.collect.Lists;
import com.permission.model.SysDept;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
public class DeptLevelDto extends SysDept {

    private List<DeptLevelDto> deptList= Lists.newArrayList();

    public static DeptLevelDto adapt(SysDept dept){
        DeptLevelDto dto=new DeptLevelDto();
        BeanUtils.copyProperties(dept,dto);
        return dto;
    }
}
