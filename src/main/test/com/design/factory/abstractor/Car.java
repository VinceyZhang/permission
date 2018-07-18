package com.design.factory.abstractor;

public abstract class Car {

    /**
     * 窗户
     */
    protected  Window window;
    /**
     * 轮胎，只列举两个
     */
    protected Tyre tyre;
    private  String name;

    public abstract void install();

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
