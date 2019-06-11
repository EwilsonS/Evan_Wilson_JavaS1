package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserWithACouunter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        try {
            int userGuess = 0;
            int numGuesses = 0;
            int pcRand = rand.nextInt(9) + 1;
            numGuesses += 1;

            System.out.println("Try to guess my number between 1-10");

            while (userGuess != pcRand) {
                userGuess = scan.nextInt();
                if (userGuess != pcRand) {
                    System.out.println("Try again");
                    numGuesses++;
                    continue;
                }
                break;
            }
            System.out.println("Good Job.... it took you " + numGuesses + " tries");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid input");
        }
    }

}
