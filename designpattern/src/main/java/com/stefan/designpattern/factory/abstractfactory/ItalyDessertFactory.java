package com.stefan.designpattern.factory.abstractfactory;

public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {

        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {

        return new Tiramisu();
    }

}
