package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Give number of elements: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Minimum number is: " + findMin(array));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Give element " + i + " :");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
