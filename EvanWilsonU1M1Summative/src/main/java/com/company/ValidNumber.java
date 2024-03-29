package com.company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 10.
        System.out.println("Enter a number between 1 and 10");
        int num = scan.nextInt();

        while (num < 1 || num > 10) {
            // If the user enters a number less than 1 or greater than 10, display the following error message and prompt the user for another entry:
            if (num < 1 || num > 10) {
                System.out.println("You must enter a number between 1 and 10, please try again.");
                num = scan.nextInt();
                continue;
            }
        }
        // When the user enters a valid number, print the number to the screen and exit.
        System.out.println(num);
    }
}
