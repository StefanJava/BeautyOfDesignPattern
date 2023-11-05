package com.stefan.designpattern.factory.method;

public class ClientTest {

    public static void main(String[] args) {

        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        CoffeeStore coffeeStore = new CoffeeStore(americanCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();

        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        coffee = coffeeStore.orderCoffee();
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();
    }
}
