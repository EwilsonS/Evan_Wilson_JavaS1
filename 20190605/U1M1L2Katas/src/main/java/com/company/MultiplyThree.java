package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        //Multiply 3 numbers input by the user.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Three numbers quick \nGO!");
        int a = myScanner.nextInt();

        System.out.println("Next");
        int b = myScanner.nextInt();

        System.out.println("Finally");
        int c = myScanner.nextInt();


        int product = a * b * c;
        System.out.println("Your numbers multiplied = " + product);


    }
}