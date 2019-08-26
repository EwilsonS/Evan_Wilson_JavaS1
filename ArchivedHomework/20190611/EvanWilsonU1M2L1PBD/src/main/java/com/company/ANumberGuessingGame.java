package com.company;

import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {

            Random rand = new Random();
            int userGuess;
            int pcRand = rand.nextInt(10);
            pcRand += 1;

            System.out.println("Try to guess my number between 1-10");
            userGuess = scan.nextInt();

            if (userGuess == pcRand) {
                System.out.println("WINNER!!!! My number was " + pcRand);
            } else {
                System.out.println("Sorry, my number is " + pcRand);
            }
        }catch (java.util.InputMismatchException ex){
            System.out.println("Invalid input");
        }
    }
}
