package com.design.factory.method;

public class ChinaCar extends Car {

    public ChinaCar() {
    }

    public ChinaCar(String name, Integer price) {
        super(name, price);
        this.country = "国产";
    }
}
