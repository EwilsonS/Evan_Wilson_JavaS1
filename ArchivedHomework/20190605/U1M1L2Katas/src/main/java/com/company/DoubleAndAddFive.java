package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        //Double the number inputted by the user and then add 5. Print the result to the screen.

        Scanner myScanner = new Scanner(System.in);
        System.out.format("Enter a number then press ENTER");


        float num = myScanner.nextFloat();
        float doubled = num * 2;
        float plusFive = doubled + 5;


        System.out.format("Here's your number: %.0f \n" +
                "Doubled: %.0f \n" +
                "Plus five: %.0f", num, doubled, plusFive);


    }
}
