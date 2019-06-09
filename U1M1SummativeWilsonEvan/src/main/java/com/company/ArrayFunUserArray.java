package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        // Your code must read 5 ints from the user, put them in an array, and print the array elements to the screen.

        Scanner scan = new Scanner(System.in);
        try {
            int[] arr = new int[5];
            String[] msg = {"Please enter FIVE numbers \nGo:", "Next", "Keep going", "Almost there", "Last one"};
            for (int i = 0; i < 5; i++) {
                System.out.println(msg[i]);
                arr[i] = scan.nextInt();
            }

            System.out.println("\nYour numbers:");

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("NUMBERS between -2147483648 and -2147483648 only please. Restart the program");
        }
    }
}
