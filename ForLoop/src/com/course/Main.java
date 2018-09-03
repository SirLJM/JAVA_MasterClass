package com.course;

public class Main {

    public static void main(String[] args) {

        double amount = 10000.0;
        double interestRate = 7.0;
        System.out.println(calculateInterest(amount, interestRate));

        for(int i=2; i<9; i++) {
            System.out.println(String.format("%.2f",calculateInterest(amount, i)));
        }

        System.out.println(" ");

        for(int i=8; i>1; i--) {
            System.out.println(String.format("%.2f",calculateInterest(amount, i)));
        }

        System.out.println();

        numberOfPrimes();
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<=(long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void numberOfPrimes() {
        int count = 0;
        for(int i=2;; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            } else if (count == 1000000) {
                break;
            }
        }

    }
}
