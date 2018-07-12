package com.design.factory.abstractor;

public class ChinaCar extends Car {
    private ChinaCarFactory chinaCarFactory;

    public ChinaCar(ChinaCarFactory chinaCarFactory) {
        this.chinaCarFactory = chinaCarFactory;
    }

    @Override
    public void install() {
        this.tyre=chinaCarFactory.createTyre();
        this.window=chinaCarFactory.createWindow();
    }
}
