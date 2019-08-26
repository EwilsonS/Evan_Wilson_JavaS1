package com.company;

import java.util.Scanner;

public class AddingValues {
    public static void main(String[] args) {
        System.out.println("I will add all integers you enter. Enter 0 to end and total.");

        calc();
    }
    public static void calc(){
        try {

            Scanner scan = new Scanner(System.in);
            System.out.printf("Your number: ");
            int userInput = scan.nextInt();
            int sum = userInput;

            while (userInput != 0) {
                System.out.println("Current total: " + sum);
                System.out.printf("\nYour number: ");
                userInput = scan.nextInt();
                sum+=userInput;
                continue;
            }
            System.out.println("Total: " + sum);
        }catch (java.util.InputMismatchException ex){
            System.out.println("\nWhole numbers only please\n");
            calc();
        }
    }
}
