package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;

        int firstNumberFirstDigit = firstNumber / 10;
        int secondNumberFirstDigit = secondNumber / 10;

        return firstNumberLastDigit == firstNumberFirstDigit ||
                firstNumberLastDigit == secondNumberFirstDigit ||
                secondNumberLastDigit == firstNumberFirstDigit ||
                secondNumberLastDigit == secondNumberFirstDigit;
    }
}
