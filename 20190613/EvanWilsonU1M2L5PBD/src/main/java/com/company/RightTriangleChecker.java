package com.company;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        right();
    }

    public static void right() {
        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("~Right Triangle App~\n");
            System.out.println("Enter three numbers in ascending order");
            System.out.printf("Side 1: ");
            int side1 = scan.nextInt();
            while (side1 < 1) {
                System.out.printf("No side can be 0, try again: ");
                side1 = scan.nextInt();
                continue;
            }
            System.out.printf("Side 2: ");
            int side2 = scan.nextInt();

            while (side2 < side1) {
                System.out.printf("Side 2 must be bigger than or the same as side 1: ");
                side2 = scan.nextInt();
                continue;
            }
            System.out.printf("Side 3: ");
            int side3 = scan.nextInt();

            while (side3 <= side2) {
                System.out.printf("Side 3 must be bigger than side 2 and side 1: ");
                side3 = scan.nextInt();
                continue;
            }

            while (side1 <= side2 && side2 < side3) {
                System.out.println("\nIn the case of your 3 Sides: " + side1 + " " + side2 + " " + side3 + " ...");
                if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
                    System.out.println("You ARE the right triangle!");
                    break;
                } else {
                    System.out.println("You ARE NOT the right triangle!");
                    break;
                }
            }

        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nWhy?? This is a numbers thing. Only put in numbers. OK?!\n");
            right();
        }

    }
}
