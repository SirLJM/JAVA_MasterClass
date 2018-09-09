package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (first < 10 || first > 1000 || second < 10 || second > 1000 || third < 10 || third > 1000) {
            return false;
        }

        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;

        return firstLastDigit == secondLastDigit ||
                firstLastDigit == thirdLastDigit ||
                secondLastDigit == thirdLastDigit;
    }
}
