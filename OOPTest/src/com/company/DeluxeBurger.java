package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger(String breadRollType, String meat, Chips chips, Drinks drinks, double basePrice) {
        super("Deluxe burger", breadRollType, meat, chips, drinks, basePrice);
        setNumberOfAdditions(2);
    }

}
