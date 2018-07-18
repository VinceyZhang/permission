package com.design.factory.abstractor;

public class ChinaPartFactory implements PartFactory {

    @Override
    public Tyre createTyre() {
        //自己去实现自己用何种轮胎
        Tyre tyre = new WoolTyre();
        tyre.installTyre();
        return tyre;
    }

    @Override
    public Window createWindow() {
        //自己去实现自己用何种窗户
        Window window = new BigWindow();
        window.installWindow();
        return window;
    }
}
