package com.design.factory.abstractor;

public class GermanyCar extends Car {
    private GermanyPartFactory germanyCarFactory;

    public GermanyCar(GermanyPartFactory germanyCarFactory) {
        this.germanyCarFactory = germanyCarFactory;
    }

    @Override
    public void install() {
        this.tyre=germanyCarFactory.createTyre();
        this.window=germanyCarFactory.createWindow();
    }
}
