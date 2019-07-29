package com.company;

public class Main {

    public static void main(String[] args) {

        double first = 20.00d;
        double second = 80.00d;
        double total = (first + second) * 100.00d;
        double remainder = total % 40;

        boolean isRemainderZero = remainder == 0;
        System.out.println("isRemainderZero " + isRemainderZero);

        if (!isRemainderZero)
            System.out.println("Got some remainder");
    }
}
