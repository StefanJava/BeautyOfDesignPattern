package com.stefan.designpattern.factory.method;

public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {

        return new AmericanCoffee();
    }
}
