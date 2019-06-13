package com.company;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Let's find the square root.");
            System.out.printf("Enter a number: ");
            double userNum = scan.nextInt();

            while (userNum >= 0) {
                System.out.println("The square root of " + userNum + " is " +
                        Math.sqrt(userNum));
                break;
            }
        }catch (java.util.InputMismatchException ex){
            System.out.println("Invalid input");
        }
    }
}
