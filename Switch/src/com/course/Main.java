package com.course;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or 4, or 5");
//                System.out.println("Actually it was " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//        }

        char switchChar = 'A';
        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("It was " + switchChar);
                break;
//
//            case 'B':
//                System.out.println("B");
//                break;
//
//            case 'C':
//                System.out.println("C");
//                break;
//
//            case 'D':
//                System.out.println("D");
//                break;
//
//            case 'E':
//                System.out.println("E");
//                break;
            default:
                System.out.println("Symbol not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
