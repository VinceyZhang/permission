package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-19.
 */
public class JapanDog extends Dog {

    public JapanDog() {
        this.barkBehaviour = new JapaneseDogBark();
    }
}
