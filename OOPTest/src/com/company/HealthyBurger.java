package com.company;

public class HealthyBurger extends Burger {

    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(String meat, double basePrice) {
        this(meat, null, null, null, null, null, basePrice);
        setNumberOfAdditions(0);
    }

    public HealthyBurger(String meat, Addition addition1,
                         double basePrice) {
        this(meat, addition1, null, null, null, basePrice);
        setNumberOfAdditions(1);
    }

    public HealthyBurger(String meat, Addition addition1,
                         Addition addition2, double basePrice) {
        this(meat, addition1, addition2, null, null, null, null, basePrice);
        setNumberOfAdditions(2);
    }

    public HealthyBurger(String meat, Addition addition1,
                         Addition addition2, Addition addition3, double basePrice) {
        this(meat, addition1, addition2, addition3, null, null, null, basePrice);
        setNumberOfAdditions(3);
    }

    public HealthyBurger(String meat, Addition addition1,
                         Addition addition2, Addition addition3,
                         Addition addition4, double basePrice) {
        this(meat, addition1, addition2, addition3, addition4, null, null, basePrice);
        setNumberOfAdditions(4);
    }

    public HealthyBurger(String meat, Addition addition1,
                         Addition addition2, Addition addition3,
                         Addition addition4, Addition addition5, double basePrice) {
        this(meat, addition1, addition2, addition3, addition4, addition5, null, basePrice);
        setNumberOfAdditions(5);
    }

    public HealthyBurger(String meat, Addition addition1,
                         Addition addition2, Addition addition3,
                         Addition addition4, Addition addition5,
                         Addition addition6, double basePrice) {
        super("Healthy burger", "Brown rye", meat, addition1, addition2, addition3, addition4, basePrice);
        this.addition5 = addition5;
        this.addition6 = addition6;
        setNumberOfAdditions(6);
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        switch (getNumberOfAdditions()) {
            case 0-4:
                return price;
            case 5:
                price += getAddition1().getPrice() + getAddition2().getPrice() +
                        getAddition3().getPrice() + getAddition4().getPrice() +
                        getAddition5().getPrice();
                return price;
            case 6:
                price += getAddition1().getPrice() + getAddition2().getPrice() +
                        getAddition3().getPrice() + getAddition4().getPrice() +
                        getAddition5().getPrice() + getAddition6().getPrice();
                return price;
        }
        return price;
    }

    @Override
    public void showOrder() {
        switch (getNumberOfAdditions()) {
            case 1-4:
                super.showOrder();
                break;
            case 5:
                System.out.println(getAddition1().getClass().getSimpleName() + " : " + getAddition1().getPrice());
                System.out.println(getAddition2().getClass().getSimpleName() + " : " + getAddition2().getPrice());
                System.out.println(getAddition3().getClass().getSimpleName() + " : " + getAddition3().getPrice());
                System.out.println(getAddition4().getClass().getSimpleName() + " : " + getAddition4().getPrice());
                System.out.println(getAddition5().getClass().getSimpleName() + " : " + getAddition5().getPrice());
                break;
            case 6:
                System.out.println(getAddition1().getClass().getSimpleName() + " : " + getAddition1().getPrice());
                System.out.println(getAddition2().getClass().getSimpleName() + " : " + getAddition2().getPrice());
                System.out.println(getAddition3().getClass().getSimpleName() + " : " + getAddition3().getPrice());
                System.out.println(getAddition4().getClass().getSimpleName() + " : " + getAddition4().getPrice());
                System.out.println(getAddition5().getClass().getSimpleName() + " : " + getAddition5().getPrice());
                System.out.println(getAddition6().getClass().getSimpleName() + " : " + getAddition6().getPrice());
                break;
        }
    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }
}
