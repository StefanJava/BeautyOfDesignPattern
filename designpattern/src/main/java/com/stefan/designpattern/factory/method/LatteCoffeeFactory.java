package com.stefan.designpattern.factory.method;

public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {

        return new LatteCoffee();
    }
}
