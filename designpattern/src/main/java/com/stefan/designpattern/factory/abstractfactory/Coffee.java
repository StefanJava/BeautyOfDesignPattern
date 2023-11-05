package com.stefan.designpattern.factory.abstractfactory;

public abstract class Coffee {

    public abstract void getName();

    public void addSugar() {

        System.out.println("加糖");
    }

    public void addMilk() {

        System.out.println("加奶");
    }
}
