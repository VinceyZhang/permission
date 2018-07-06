package com.permission.service;

import com.permission.dto.DeptLevelDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SysTreeService {



    public List<DeptLevelDto> deptTree();

    public List<DeptLevelDto> deptListToTree(List<DeptLevelDto> deptLevelDtoList);
}
