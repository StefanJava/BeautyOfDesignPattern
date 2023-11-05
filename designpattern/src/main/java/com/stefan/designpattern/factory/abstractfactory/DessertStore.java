package com.stefan.designpattern.factory.abstractfactory;

public class DessertStore {

    private DessertFactory factory;

    public DessertStore(DessertFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        return factory.createCoffee();
    }

    public Dessert orderDessert() {
        return factory.createDessert();
    }

    public void setFactory(DessertFactory factory) {
        this.factory = factory;
    }
}
