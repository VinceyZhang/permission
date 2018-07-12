package com.design.factory.abstractor;

public class WaterTyre implements Tyre {

    @Override
    public void installTyre() {
        System.out.println("水做的轮胎");
    }
}
