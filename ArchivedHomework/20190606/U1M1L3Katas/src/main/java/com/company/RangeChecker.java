package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number between 15-32");
        int userInput = myScanner.nextInt();
        while(userInput<16 || userInput>31){
            System.out.println("Try again");
            userInput = myScanner.nextInt();
            continue;
        }
        System.out.println(userInput);

    }
}
