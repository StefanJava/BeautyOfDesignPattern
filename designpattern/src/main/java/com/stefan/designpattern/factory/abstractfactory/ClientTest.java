package com.stefan.designpattern.factory.abstractfactory;

public class ClientTest {

    public static void main(String[] args) {

        DessertStore store = new DessertStore(new AmericanDessertFactory());
        Coffee coffee = store.orderCoffee();
        coffee.getName();
        coffee.addSugar();
        coffee.addMilk();
        Dessert dessert = store.orderDessert();
        dessert.show();

        DessertStore store1 = new DessertStore(new ItalyDessertFactory());
        Coffee coffee1 = store1.orderCoffee();
        coffee1.getName();
        coffee1.addSugar();
        coffee1.addMilk();
        Dessert dessert1 = store1.orderDessert();
        dessert1.show();
    }

}
