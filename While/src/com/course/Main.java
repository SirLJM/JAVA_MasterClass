package com.course;


public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//        int count = 0;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            count++;
//
//            if (count >= 5) {
//                break;
//            }
//        }
//
//        System.out.println("Count " + count);

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-1));

    }

    public static boolean isEvenNumber(int number) {
        return number > 0 && number % 2 == 0;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            sum+=number % 10;
            number /= 10;
        }

        return sum;
    }


}
