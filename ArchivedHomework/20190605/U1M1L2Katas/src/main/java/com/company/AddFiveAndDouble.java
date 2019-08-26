package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        //Add 5 to the number inputted by the user and then double it. Print the result to the screen.

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number, any number(under 1 Billion)");
        int num = myScanner.nextInt();
        int addFive = num + 5;
        int doubleIt = addFive * 2;

        System.out.println("Your number: " + num + "\nPlus five: " + addFive + "\nAnd doubled: " + doubleIt);
    }
}
