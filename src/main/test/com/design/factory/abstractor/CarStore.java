package com.design.factory.abstractor;

public class CarStore {
    public void show(String type) {
        if (type.equals("Germany")) {
            new GermanyCar(new GermanyPartFactory()).install();
        } else if (type.equals("China")) {
            new ChinaCar(new ChinaPartFactory()).install();
        }
    }
}
