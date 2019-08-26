package com.company;

import java.util.Scanner;

public class CountTo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = myScanner.nextInt();
        for(int i = 0; i <= num; i++){
            System.out.println(i + "\r");
        }
    }
}
