package com.stefan.designpattern.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        if ("american".equals(type)) {
            return new AmericanCoffee();
        } else if ("latte".equals(type)) {
            return new LatteCoffee();
        } else {
            throw new IllegalArgumentException("参数异常");
        }
    }
}
