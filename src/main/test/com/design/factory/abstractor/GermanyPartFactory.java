package com.design.factory.abstractor;

public class GermanyPartFactory implements PartFactory {

    @Override
    public Tyre createTyre() {
        Tyre tyre = new WaterTyre();
        tyre.installTyre();;
        return tyre;
    }

    @Override
    public Window createWindow() {
        Window window = new LittleWindow();
        window.installWindow();
        return null;
    }
}
