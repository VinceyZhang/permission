package com.permission.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by ok_vince on 2018-06-10.
 */

@Getter
@Setter
public class TestVo {

    @NotBlank
    private String msg;

    @NotNull
    private  Integer id;
}
