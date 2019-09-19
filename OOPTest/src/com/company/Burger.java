package com.company;

public class Burger {

    private String name;
    private String breadRollType;
    private String meat;
    private int numberOfAdditions;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double basePrice;


    public Burger(String name, String breadRollType, String meat, double basePrice) {
        this(name, breadRollType, meat, null, null, null, null, basePrice);
        this.numberOfAdditions = 0;
    }

    public Burger(String name, String breadRollType, String meat, Addition addition1, double basePrice) {
        this(name, breadRollType, meat, addition1, null, null, null, basePrice);
        this.numberOfAdditions = 1;
    }

    public Burger(String name, String breadRollType, String meat, Addition addition1,
                  Addition addition2, double basePrice) {
        this(name, breadRollType, meat, addition1, addition2, null, null, basePrice);
        this.numberOfAdditions = 2;
    }

    public Burger(String name, String breadRollType, String meat, Addition addition1,
                  Addition addition2, Addition addition3, double basePrice) {
        this(name, breadRollType, meat, addition1, addition2, addition3, null, basePrice);
        this.numberOfAdditions = 3;
    }

    public Burger(String name, String breadRollType, String meat, Addition addition1,
                  Addition addition2, Addition addition3, Addition addition4, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.numberOfAdditions = 4;
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        double price = this.basePrice;
        switch (this.numberOfAdditions) {
            case 0:
                return price;
            case 1:
                price += addition1.getPrice();
                return price;
            case 2:
                price += addition1.getPrice() + addition2.getPrice();
                return price;
            case 3:
                price += addition1.getPrice() + addition2.getPrice() + addition3.getPrice();
                return price;
            case 4:
                price += addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice();
                return price;
        }
        return price;
    }

    public void showOrder() {
        switch (this.numberOfAdditions) {
            case 1:
                System.out.println(addition1.getClass().getSimpleName() + " : " + addition1.getPrice());
                break;
            case 2:
                System.out.println(addition1.getClass().getSimpleName() + " : " + addition1.getPrice());
                System.out.println(addition2.getClass().getSimpleName() + " : " + addition2.getPrice());
                break;
            case 3:
                System.out.println(addition1.getClass().getSimpleName() + " : " + addition1.getPrice());
                System.out.println(addition2.getClass().getSimpleName() + " : " + addition2.getPrice());
                System.out.println(addition3.getClass().getSimpleName() + " : " + addition3.getPrice());
                break;
            case 4:
                System.out.println(addition1.getClass().getSimpleName() + " : " + addition1.getPrice());
                System.out.println(addition2.getClass().getSimpleName() + " : " + addition2.getPrice());
                System.out.println(addition3.getClass().getSimpleName() + " : " + addition3.getPrice());
                System.out.println(addition4.getClass().getSimpleName() + " : " + addition4.getPrice());
                break;
        }
    }

    public void showOrderAndPrice() {
        System.out.println("|" + getName() + "|" + "\n"
                + "Bread roll type: " + getBreadRollType() + "\n"
                + "Meat: " + getMeat() + "\n"
                + "Base price: " + getBasePrice());
        this.showOrder();
        System.out.println("Full price: " + this.calculatePrice());
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setNumberOfAdditions(int numberOfAdditions) {
        this.numberOfAdditions = numberOfAdditions;
    }
}
