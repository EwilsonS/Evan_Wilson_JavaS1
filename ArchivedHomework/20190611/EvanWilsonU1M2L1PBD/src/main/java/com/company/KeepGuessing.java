package com.company;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Try to guess my number between 1-10");
            Random rand = new Random();
            int userGuess = 0;
            int pcRand = rand.nextInt(10) + 1;
            while (userGuess != pcRand) {
                userGuess = scan.nextInt();
                if (userGuess != pcRand) {
                    System.out.println("Try again");
                    continue;
                }
                break;
            }
            System.out.println("Good Job");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid input");
        }
    }
}
