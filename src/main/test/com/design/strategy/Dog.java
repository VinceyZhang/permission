package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-18.
 */
public abstract class Dog {

    protected String name;

    protected BarkBehaviour barkBehaviour;

    protected RunBehaviour runBehaviour;


    public BarkBehaviour getBarkBehaviour() {
        return barkBehaviour;
    }

    public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
        this.barkBehaviour = barkBehaviour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
