package com.design.factory.method;

public abstract class GermanyCar extends Car {


    public GermanyCar() {
    }

    public GermanyCar(String name, Integer price) {
        super(name, price);
        this.country = "德国";
    }

}
