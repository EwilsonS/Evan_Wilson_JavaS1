package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = myScanner.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
