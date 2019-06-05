package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        //Add 13 to the value inputted by the user and print the result to the screen.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number, and I'll add thirteen to it");
        int num = myScanner.nextInt();
        int addThirteen = num + 13;

        System.out.println("Your number: " + num + "\nPlus thirteen: " + addThirteen);
    }
}
