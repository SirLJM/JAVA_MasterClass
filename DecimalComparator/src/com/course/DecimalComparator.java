package com.course;



public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a *= 1000;
        b *= 1000;
        int a1 = (int) a;
        int b1 = (int) b;
        if(a1 == b1) {
            return true;
        } else {
            return false;
        }
    }
}
