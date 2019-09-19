package com.company;

public class HealthyBurger extends Burger {

    private int numberOfExtraAdditions;
    private Addition extraAddition1;
    private Addition extraAddition2;

    public HealthyBurger(String meat, int numberOfAdditions, int numberOfExtraAdditions, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition extraAddition1, Addition extraAddition2, double basePrice) {
        super("Healthy burger","Brown rye", meat, numberOfAdditions, addition1, addition2, addition3, addition4, basePrice);
        if (numberOfExtraAdditions < 0 || numberOfExtraAdditions >= 3) {
            System.out.println("Extra additions only between 0 and 2");
        } else {
            switch (numberOfExtraAdditions) {
                case 0:
                    this.extraAddition1 = null;
                    this.extraAddition2 = null;
                case 1:
                    this.extraAddition1 = extraAddition1;
                    this.extraAddition2 = null;
                    break;
                case 2:
                    this.extraAddition1 = extraAddition1;
                    this.extraAddition2 = extraAddition2;
                    break;
            }
        }
        this.numberOfExtraAdditions = numberOfExtraAdditions;
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        switch (this.numberOfExtraAdditions) {
            case 1:
                price += extraAddition1.getPrice();
                return price;
            case 2:
                price += extraAddition1.getPrice() + extraAddition2.getPrice();
                return price;
        }
        return price;
    }

    @Override
    public void showOrder() {
        System.out.println("|" + getName() + "|" + "\n"
                + "Bread roll type: " + getBreadRollType() + "\n"
                + "Meat: " + getMeat() + "\n"
                + "Base price: " + getBasePrice());
        switch (getNumberOfAdditions()) {
            case 1:
                System.out.println(getAddition1().getClass().getSimpleName() + " : " + getAddition1().getPrice());
                break;
            case 2:
                System.out.println(getAddition1().getClass().getSimpleName() + " : " + getAddition1().getPrice());
                System.out.println(getAddition2().getClass().getSimpleName() + " : " + getAddition2().getPrice());
                break;
            case 3:
                System.out.println(getAddition1().getClass().getSimpleName() + " : " + getAddition1().getPrice());
                System.out.println(getAddition2().getClass().getSimpleName() + " : " + getAddition2().getPrice());
                System.out.println(getAddition3().getClass().getSimpleName() + " : " + getAddition3().getPrice());
                break;
            case 4:
                System.out.println(getAddition1().getClass().getSimpleName() + " : " + getAddition1().getPrice());
                System.out.println(getAddition2().getClass().getSimpleName() + " : " + getAddition2().getPrice());
                System.out.println(getAddition3().getClass().getSimpleName() + " : " + getAddition3().getPrice());
                System.out.println(getAddition4().getClass().getSimpleName() + " : " + getAddition4().getPrice());
                break;
        }

        switch (this.numberOfExtraAdditions) {
            case 1:
                System.out.println(extraAddition1.getClass().getSimpleName() + " : " + extraAddition1.getPrice());
                break;
            case 2:
                System.out.println(extraAddition1.getClass().getSimpleName() + " : " + extraAddition1.getPrice());
                System.out.println(extraAddition2.getClass().getSimpleName() + " : " + extraAddition2.getPrice());
                break;
        }

        System.out.println("Total price: " + calculatePrice());
    }

    public int getNumberOfExtraAdditions() {
        return numberOfExtraAdditions;
    }

    public Addition getExtraAddition1() {
        return extraAddition1;
    }

    public Addition getExtraAddition2() {
        return extraAddition2;
    }
}
