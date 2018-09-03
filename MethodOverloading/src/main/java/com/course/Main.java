package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

//        int newScore = calculateScore("Luc", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
//        System.out.println(calcFeetAndInchesToCentimeters(7,5));
        calcFeetAndInchesToCentimeters(-10);
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " +
//                playerName + " scored " +
//                score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " +
//                score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            logger.info("Invalid parameters");
            return -1;
        }

        double centimeters = inches * 2.54 + (feet * 12) * 2.54;
        logger.info("FE + IN = " + centimeters + " CM");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            logger.info("Invalid parameters");
            return -1;
        }

        double feet = (int) inches / 12;
        double remInches = (int) inches % 12;
        logger.info(inches + " inches equals " + feet + " feet and " + remInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remInches);
    }
}
