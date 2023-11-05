package com.stefan.designpattern.factory.method;

public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {

        return coffeeFactory.createCoffee();
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }
}
