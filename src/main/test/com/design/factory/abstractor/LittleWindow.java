package com.design.factory.abstractor;

public class LittleWindow implements Window {

    @Override
    public void installWindow() {
        System.out.println("预算不够，安装小窗户~~~~~");
    }
}
