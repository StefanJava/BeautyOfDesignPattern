package com.stefan.designpattern.factory.simple;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        return SimpleFactory.createCoffee(type);
    }
}
