package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Intro, get user name
        System.out.println("Enter a number between 1-100");
        int num = myScanner.nextInt();


        while (num != 42) {
            if (num != 42) {
                System.out.println("Enter a number between 1-100");
                num = myScanner.nextInt();
                continue;
            }
        }
        System.out.println("That's the number I was looking for! 42 is definitely the answer!");
    }
}
