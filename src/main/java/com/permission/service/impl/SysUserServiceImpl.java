package com.permission.service.impl;

import com.google.common.base.Preconditions;
import com.permission.dao.SysUserMapper;
import com.permission.exception.ParamException;
import com.permission.model.SysUser;
import com.permission.param.UserParam;
import com.permission.service.SysUserService;
import com.permission.util.BeanValidator;
import com.permission.util.MD5Util;
import com.permission.util.PasswordUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public void save(UserParam param) {
        BeanValidator.check(param);
        if (checkTelephoneExist(param.getMail(), param.getId())) {
            throw new ParamException("电话已被占用！");
        }
        if (checkMailExist(param.getMail(), param.getId())) {
            throw new ParamException("邮箱已被占用！");
        }
        String password = PasswordUtil.randomPassword();
        //TODO:
        password = "12345678";
        String encryptedPassword = MD5Util.encrypt(password);
        SysUser user = SysUser.builder().username(param.getUsername()).telephone(param.getTelephone()).mail(param.getMail())
                .password(encryptedPassword).deptId(param.getDeptId()).status(param.getStatus()).remark(param.getRemark()).build();
        user.setOperator("system");
        user.setOperateIp("127.0.0.1");
        user.setOperateTime(new Date());
        // TODO: sendEmail

        sysUserMapper.insert(user);

    }

    @Override
    public void update(UserParam param) {
        BeanValidator.check(param);
        if (checkTelephoneExist(param.getMail(), param.getId())) {
            throw new ParamException("电话已被占用！");
        }
        if (checkMailExist(param.getMail(), param.getId())) {
            throw new ParamException("邮箱已被占用！");
        }

        SysUser before = sysUserMapper.selectByPrimaryKey(param.getId());
        Preconditions.checkNotNull(before, "待更新的用户不存在");
        SysUser after = SysUser.builder().username(param.getUsername()).telephone(param.getTelephone())
                .mail(param.getMail()).deptId(param.getDeptId()).status(param.getStatus())
                .remark(param.getRemark()).build();

        sysUserMapper.updateByPrimaryKey(after);
    }


    @Override
    public SysUser findByKeyword(String username) {
        return sysUserMapper.findByKeyword(username);
    }

    private boolean checkMailExist(String mail, Integer id) {
        return sysUserMapper.countByMail(mail, id) > 0;
    }

    private boolean checkTelephoneExist(String telephone, Integer id) {

        return sysUserMapper.countByTelephone(telephone, id) > 0;
    }
}
