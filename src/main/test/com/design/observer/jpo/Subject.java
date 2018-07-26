package com.design.observer.jpo;

/**
 * Created by ok_vince on 2018-07-26.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void updatePrice();
}
