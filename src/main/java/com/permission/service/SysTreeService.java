package com.permission.service;

import com.permission.dto.DeptLevelDto;

import java.util.List;

public interface SysTreeService {



    public List<DeptLevelDto> deptTree();

    public List<DeptLevelDto> deptListToTree(List<DeptLevelDto> deptLevelDtoList);
}
