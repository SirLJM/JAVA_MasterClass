package com.course;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult= result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");
        else
            System.out.println("It is alien");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less then 100");

        if ((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these test is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        System.out.println("wasCar is true");

        double first = 20;
        double second = 80;
        double sum = (first + second) * 25;
        double remainder = sum % 40;
        if (remainder <= 20)
            System.out.println("Total was over the limit");


    }
}
