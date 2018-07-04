package com.permission.service;

import com.permission.common.JsonData;
import com.permission.model.SysDept;
import com.permission.param.DeptParam;

import java.util.List;

/**
 * Created by ok_vince on 2018-06-30.
 */
public interface SysDeptService {




    void save(DeptParam param);

    void update(DeptParam param);
}
