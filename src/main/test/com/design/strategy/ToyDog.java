package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-19.
 */
public class ToyDog extends Dog {
    public ToyDog() {
        this.barkBehaviour = new ToyDogBark();
    }
}
