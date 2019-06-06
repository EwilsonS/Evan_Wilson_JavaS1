package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        // Intro, get user name
        System.out.println("Welcome to Hi-Low!");
        System.out.println("What's your name?");
        String userName = myScanner.nextLine();

        // Rules, prompt user guess
        System.out.println("OK, " + userName + ", here are the rules:");
        System.out.println("You need to guess what number I have, 1-100 \n" +
                "I will tell you Too high or Too low \n" +
                "Keep going until you guess correctly");
        System.out.println("Enter your guess:");

        int userGuess = myScanner.nextInt();

        // Create random number and init user guess count
        Random randGen = new Random();
        int randNum = randGen.nextInt(100) + 1;
        int numGuesses = 0;

        //System.out.println(randNum); // temporary to manually test code

        // Check user's guess to random
        while (userGuess != randNum) {
            numGuesses ++;
            if (userGuess < randNum) {
                System.out.println("Too low, try again");
                userGuess = myScanner.nextInt();
                continue;
            }else{
                System.out.println("Too high, try again");
                userGuess = myScanner.nextInt();
                continue;
            }
        }
        System.out.println("Congratulations, " + userName + "!" + " You win!");
        System.out.println("It took you " + numGuesses + " guesses to find my number!");
        System.out.println("\n");



    }
}
