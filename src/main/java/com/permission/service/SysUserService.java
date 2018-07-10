package com.permission.service;

import com.permission.model.SysUser;
import com.permission.param.UserParam;

public interface SysUserService {

    void save(UserParam param);

    void update(UserParam param);

    SysUser findByKeyword(String username);
}
