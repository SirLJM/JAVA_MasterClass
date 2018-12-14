package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        int prime = -1;

        if (number <= 0) {
            return -1;
        }

        while (number % 2 == 0) {
            prime = 2;
//            number >>= 1;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                prime = i;
                number = number / i;
            }
        }

        if (number > 2) {
            prime = number;
        }

        return prime;
    }
}
