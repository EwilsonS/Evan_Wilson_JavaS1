package com.company;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter your weight and press ENTER:");
            float userWeight = scan.nextFloat();

            System.out.println("\nChoose your destination and press ENTER: \n\n1. Venus    2. Mars\n3. Jupiter  4. Saturn\n5. Uranus   6. Neptune\n");
            int planet = scan.nextInt();

            switch (planet) {
                case 1:
                    System.out.format("Your weight is %.2f on Venus.\n", userWeight * .78);
                    break;
                case 2:
                    System.out.format("Your weight is %.2f on Mars.\n", userWeight * .39);
                    break;
                case 3:
                    System.out.format("Your weight is %.2f on Jupiter.\n", userWeight * 2.65);
                    break;
                case 4:
                    System.out.format("Your weight is %.2f on Saturn.\n", userWeight * 1.17);
                    break;
                case 5:
                    System.out.format("Your weight is %.2f on Uranus.\n", userWeight * 1.05);
                    break;
                case 6:
                    System.out.format("Your weight is %.2f on Neptune.\n", userWeight * 1.23);
                    break;
            }
        }catch (java.util.InputMismatchException ex){
            System.out.println("NUMBERS only please! Restart the program.");
        }
    }
}
