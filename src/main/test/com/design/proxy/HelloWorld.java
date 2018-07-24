package com.design.proxy;

import java.io.Serializable;

public class HelloWorld implements Serializable {

    private String name = "ok_vincey";

    private Integer age = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "这是一个远程对象：name=" + this.age + ",age=" + this.age;
    }
}
