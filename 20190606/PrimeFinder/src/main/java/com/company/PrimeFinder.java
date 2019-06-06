package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        //Write a program that takes a user input as a ceiling
        //(inclusive) and prints all the prime numbers from 1 to the user input.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type a NUMBER see all the PRIMES below:");
        int userInput = myScanner.nextInt();
        boolean prime = true;

        for (int k = 2; k <= userInput; k++) {
            for (int i = 2; i < k; i++) {

                if (k % i == 0) {
                    prime = false;
                    break;
                }
                    prime = true;

            }
            if (prime) {
                System.out.println(k);
            }
        }

    }
}
