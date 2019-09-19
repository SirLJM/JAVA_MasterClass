package com.company;

public class Main {

    public static void main(String[] args) {

        Lettuce lettuce = new Lettuce(1.00);
        Tomato tomato = new Tomato(1.50);
        Carrot carrot = new Carrot(0.50);
        Chips chips = new Chips(5.00);
        Drinks drinks = new Drinks(4.50);
        Onion onion = new Onion(2.00);

        Burger burger = new Burger("Tim's burger", "Wheat", "Beef",3.50);
        burger.showOrderAndPrice();

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", lettuce, tomato, chips, drinks, carrot,4.00);
        healthyBurger.showOrderAndPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Dark Wheat", "Pork", chips, drinks, 8.00);
        deluxeBurger.showOrderAndPrice();
    }
}
