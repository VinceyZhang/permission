package com.permission.service.impl;

import com.permission.dao.SysDeptMapper;
import com.permission.param.DeptParam;
import com.permission.service.SysDeptService;
import com.permission.util.BeanValidator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ok_vince on 2018-06-30.
 */
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public void save(DeptParam param) {
        BeanValidator.check(param);

    }
}
