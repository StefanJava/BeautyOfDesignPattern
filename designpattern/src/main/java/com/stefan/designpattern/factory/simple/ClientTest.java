package com.stefan.designpattern.factory.simple;

public class ClientTest {

    public static void main(String[] args) {

        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("american");
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();

        coffee = store.orderCoffee("latte");
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();
    }
}
