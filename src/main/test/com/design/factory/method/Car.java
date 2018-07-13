package com.design.factory.method;


/**
 * 抽象的产品
 */
public abstract class Car {

    protected Integer price;
    protected String name;
    protected String country;

    public Car() {
    }

    public Car(String name, Integer price) {
        this.price = price;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
