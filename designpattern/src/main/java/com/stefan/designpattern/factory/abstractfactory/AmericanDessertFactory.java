package com.stefan.designpattern.factory.abstractfactory;

public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {

        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {

        return new MatchaMousse();
    }

}
