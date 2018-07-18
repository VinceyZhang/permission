package com.design.factory.abstractor;

public class ChinaCar extends Car {
    //国产车拥有国产工厂
    private ChinaPartFactory chinaCarFactory;

    public ChinaCar(ChinaPartFactory chinaCarFactory) {
        this.chinaCarFactory = chinaCarFactory;
    }

    @Override
    public void install() {
        this.tyre=chinaCarFactory.createTyre();
        this.window=chinaCarFactory.createWindow();
    }
}
