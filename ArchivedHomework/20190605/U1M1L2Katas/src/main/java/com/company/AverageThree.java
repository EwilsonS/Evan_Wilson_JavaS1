package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        //Find the average of 3 numbers input by the user.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers, press ENTER after each \nFirst");
        float a = myScanner.nextFloat();

        System.out.println("Second");
        float b = myScanner.nextFloat();

        System.out.println("Third");
        float c = myScanner.nextFloat();

        float avg = (a + b + c)/3;
        System.out.format("Your average is: %.2f " , avg);


    }
}
