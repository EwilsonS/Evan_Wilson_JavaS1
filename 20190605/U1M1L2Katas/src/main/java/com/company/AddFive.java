package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        //Add 5 numbers input by user
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Let's do some addition! \nEnter 5 numbers \nPress ENTER after each one \nBegin");
        long a = myScanner.nextInt();

        System.out.println("And another one");
        long b = myScanner.nextInt();

        System.out.println("Keep going");
        long c = myScanner.nextInt();

        System.out.println("Almost there");
        long d = myScanner.nextInt();

        System.out.println("Last one");
        long e = myScanner.nextInt();

        long sum = a + b + c + d + e;
        System.out.println("Grand Total: " + sum);
    }
}
