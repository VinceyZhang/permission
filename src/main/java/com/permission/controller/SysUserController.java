package com.permission.controller;

import com.permission.common.JsonData;
import com.permission.model.SysUser;
import com.permission.param.DeptParam;
import com.permission.param.UserParam;
import com.permission.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sys/user")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/user.page")
    public ModelAndView page() {
        return new ModelAndView("dept");
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(UserParam param) {
        sysUserService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateDept(UserParam param) {
        sysUserService.update(param);
        return JsonData.success();
    }
}
