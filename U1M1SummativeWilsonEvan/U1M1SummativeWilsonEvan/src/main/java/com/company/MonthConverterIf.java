package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 12.
        System.out.println("Enter a number between 1 and 12");
        int num = scan.nextInt();

        // Print out the name of the month corresponding to the number typed in by the user.
        if (num == 1) {
            System.out.println("January");
        } else if (num == 2) {
            System.out.println("February");
        } else if (num == 3) {
            System.out.println("March");
        } else if (num == 4) {
            System.out.println("April");
        } else if (num == 5) {
            System.out.println("May");
        } else if (num == 6) {
            System.out.println("June");
        } else if (num == 7) {
            System.out.println("July");
        } else if (num == 8) {
            System.out.println("August");
        } else if (num == 9) {
            System.out.println("September");
        } else if (num == 10) {
            System.out.println("October");
        } else if (num == 11) {
            System.out.println("November");
        } else if (num == 12) {
            System.out.println("December");
        } else {
            // Invalid entry
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}

