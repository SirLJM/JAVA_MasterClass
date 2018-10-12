package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        int reverse = reverse(number);
        StringBuilder answer = new StringBuilder();
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            while (reverse > 0) {
                switch (reverse % 10) {
                    case 0: answer.append("Zero "); break;
                    case 1: answer.append("One "); break;
                    case 2: answer.append("Two "); break;
                    case 3: answer.append("Three "); break;
                    case 4: answer.append("Four "); break;
                    case 5: answer.append("Five "); break;
                    case 6: answer.append("Six "); break;
                    case 7: answer.append("Seven "); break;
                    case 8: answer.append("Eight "); break;
                    case 9: answer.append("Nine "); break;
                }
                reverse /= 10;
            }
            if (getDigitCount(number) - getDigitCount(reverse(number)) > 0) {
                int result = getDigitCount(number) - getDigitCount(reverse(number));
                while (result > 0) {
                    answer.append("Zero ");
                    result--;
                }
            }
            System.out.println(answer.toString().trim());
        }

    }

    public static int reverse(int number) {
        int result = 0;
        StringBuilder reverse = new StringBuilder();
        if (number > 0) {
            reverse.append(number);
            reverse.reverse();
            result = Integer.parseInt(reverse.toString());
        } else {
            reverse.append(Math.abs(number));
            reverse.reverse();
            result = Integer.parseInt(reverse.toString()) * -1;
        }
        return result;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number > 0) {
                count++;
                number /= 10;
            }
        }
        return count;
    }
}
