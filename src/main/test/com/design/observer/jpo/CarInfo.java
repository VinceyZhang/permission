package com.design.observer.jpo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by ok_vince on 2018-07-26.
 */
public class CarInfo extends java.util.Observer {

    private List<Observer> observerList;
    private String name;
    private Double price;

    public CarInfo() {

    }

    @Override
    public void update(Observable o, Object arg) {

    }


    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }


    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i > 0) {
            observerList.remove(i);
        }
    }


    public void updatePrice() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = observerList.get(i);
            observer.update(name, price);
        }
    }

    public void change() {
        updatePrice();
    }

    public void setMembers(String name, Double price) {
        this.name = name;
        this.price = price;
        change();
    }


    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
