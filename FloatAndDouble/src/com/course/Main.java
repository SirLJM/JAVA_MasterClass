package com.course;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
        int myIntVal = 5 / 2;
        //width of float = 32 (4 bytes)
        float myFloatVal = 5f / 3f;
        //width of double = 64 (8 bytes)
        double myDoubleVal = 5d / 3d;

        System.out.println("myIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println("myDoubleVal = " + myDoubleVal);

        double pounds = 200d;
        double kilograms = 0.45359237 * pounds;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

    }
}
