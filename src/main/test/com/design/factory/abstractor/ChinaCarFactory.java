package com.design.factory.abstractor;

public class ChinaCarFactory implements CarFactory {

    @Override
    public Tyre createTyre() {
        Tyre tyre = new WoolTyre();
        tyre.installTyre();
        return tyre;
    }

    @Override
    public Window createWindow() {
        Window window = new BigWindow();
        window.installWindow();
        return window;
    }
}
