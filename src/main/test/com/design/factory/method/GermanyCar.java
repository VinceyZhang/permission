package com.design.factory.method;

public class GermanyCar extends Car {


    public GermanyCar() {
    }

    public GermanyCar(String name, Integer price) {
        super(name, price);
        this.country = "德国";
    }

}
