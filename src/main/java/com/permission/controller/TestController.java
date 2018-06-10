package com.permission.controller;

import com.permission.common.JsonData;
import com.permission.exception.PermissionException;
import com.permission.param.TestVo;
import com.permission.util.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by ok_vince on 2018-06-10.
 */
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo vo) {

        log.info("validate");
        try {
            Map<String, String> map = BeanValidator.validateObject(vo);
            if (map != null && map.entrySet().size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    log.info("{}->{}", entry.getValue());
                }
            }
        } catch (Exception ex) {

        }

        return JsonData.success("test exception");
    }
}
