package com.permission.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by ok_vince on 2018-06-30.
 */
@Getter
@Setter
@ToString
public class DeptParam {
    private Integer id;

    @NotBlank(message = "部门名称不能为空！")
    @Length(max=15,min=2,message = "部门名称长度需要在2-15个字符之间")
    private String name;

    private  Integer parentId;

    @NotNull(message = "展示顺序不能为空")
    private Integer seq;

    @Length(max = 15,message = "备注的长度需要在150个字符之内")
    private String remark;
}
