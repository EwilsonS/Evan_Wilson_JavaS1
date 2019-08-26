package com.company;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int attempts = 0;

        while (die1 != die2) {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            System.out.println("\nDie 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + (die1 + die2));
            attempts++;
            continue;
        }
        System.out.println("\nYOU ROLLED DOUBLES after " + attempts + " attempt(s)!!");
    }

}
