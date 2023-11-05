package com.stefan.designpattern.factory.simple;

public class SimpleFactory {

    public static Coffee createCoffee(String type) {

        if ("american".equals(type)) {
            return new AmericanCoffee();
        } else if ("latte".equals(type)) {
            return new LatteCoffee();
        } else {
            throw new IllegalArgumentException("参数异常");
        }
    }
}
