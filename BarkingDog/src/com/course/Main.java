package com.course;

public class Main {

    public static void main(String[] args) {

        System.out.println(BarkingDog.bark(true, 1));
        System.out.println(BarkingDog.bark(false, 2));
        System.out.println(BarkingDog.bark(true, 8));
        System.out.println(BarkingDog.bark(true, -1));
    }
}
