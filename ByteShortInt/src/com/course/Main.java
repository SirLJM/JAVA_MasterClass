package com.course;

public class Main {

    public static void main(String[] args) {

        // Int has a widthg of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        // Byte has a widthg of 8
        byte myByteValue = -128;
        byte myByteTotal = (byte)(myByteValue/2);

        // Short has a widthg of 16
        short myShortValue = -32768;


        // Long has a widthg of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        byte first = 10;
        short second = 20;
        int third = 50;
        long forth = 50000 + 10*(first + second + third);

        System.out.println(forth);

    }
}
