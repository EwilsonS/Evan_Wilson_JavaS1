package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Your code must get 5 words from the user
        System.out.println("Please enter 5 words. Press ENTER after each one:");

        // Put them in an array
        String[] words = new String[5];
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }

        // print the array elements to the screen.
        for (String element : words) {
            System.out.println(element);
        }
    }
}
