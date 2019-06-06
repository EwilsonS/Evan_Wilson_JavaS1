package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {
  /*
YourAgeCan: Write a program that asks the user's age and then prints out whether that person can:
Vote (18+)
Drink alcohol (21+)
Be president (35+)
Is eligible for AARP (55+)
Can retire (65+)
Is an octogenerian (80-89)
Is more than a century old (100+)
 */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hi, how old are you?");

        int age = myScanner.nextInt();

        if (age >= 18) {
            System.out.println("vote");
        }  if (age >= 21) {
            System.out.println("alcohol");
        }  if (age >= 35) {
            System.out.println("president");
        }  if (age >= 55) {
            System.out.println("aarp");
        }  if (age >= 65) {
            System.out.println("retire");
        }  if (age > 78 && age < 90) {
            System.out.println("octogenarian");
        }  if (age >= 100) {
            System.out.println("century");
        }

    }
}
