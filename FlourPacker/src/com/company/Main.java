package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(3, 2, -12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = 5 * bigCount + smallCount;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if (goal <= sum) {
            goal %= 5;
        }
        if (goal <= smallCount) {
            return true;
        }
        return false;
    }
}
