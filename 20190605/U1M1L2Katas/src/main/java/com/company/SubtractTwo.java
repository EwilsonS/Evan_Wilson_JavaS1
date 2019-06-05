package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {

        // Subtract the second number from the first number inputted by the user.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Subtraction time! I need two numbers \nFirst number");
        int a = myScanner.nextInt();

        System.out.println("Second number");
        int b = myScanner.nextInt();

        int difference = a - b;

        System.out.println("The difference is: " + difference);

    }
}