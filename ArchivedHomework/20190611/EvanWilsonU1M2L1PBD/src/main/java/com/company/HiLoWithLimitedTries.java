package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        try {
            int userGuess = 0;
            int guessesLeft = 7;
            int pcRand = rand.nextInt(99) + 1;
            guessesLeft -= 1;

            System.out.println("Try to guess my number between 1-100, you have 7 guesses");
//            userGuess = scan.nextInt();

            while (userGuess != pcRand && guessesLeft >= 0) {
                userGuess = scan.nextInt();
                if (userGuess != pcRand) {
                    if (userGuess > pcRand) {
                        System.out.println("TOO HIGH!, you have " + guessesLeft + " guesses left!");
                        guessesLeft--;
                        continue;
                    } else if (userGuess < pcRand) {
                        System.out.println("TOO LOW!, you have " + guessesLeft + " guesses left!");
                        guessesLeft--;
                        continue;
                    }
                }
                break;
            }
            if (userGuess == pcRand) {

                System.out.println("WINNER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }else {
                System.out.println("Sorry you're out of guesses. My number was " + pcRand);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid input");
        }
    }

}
