package com.company;

public class Main {

    public static void main(String[] args) {

        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
        } else {
            for (int j = 1; j <= number; j++) {
                if (j == 1 || j == number) {
                    for (int i = 1; i <= number; i++) {
                        System.out.print("*");
                    }
                }

                for (int k = 1; k <= number; k++) {
                    if (j == 1 || j == number) {
                        continue;
                    }
                    if (k == 1 || k == number || k == j || k == ((number - j) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }

    public static void printSquareStar2(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) {
                        System.out.print("*");
                    } else if (i > 1 && i < number && (j == 1 || j == number)) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else if (j == ((number - i) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
