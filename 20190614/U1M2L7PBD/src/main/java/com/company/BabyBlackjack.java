package com.company;

import java.util.Random;

public class BabyBlackjack {
    public static void main(String[] args) {
        Random randGen = new Random();

        int user1 = randGen.nextInt(10) + 1;
        int user2 = randGen.nextInt(10) + 1;

        int dealer1 = randGen.nextInt(10) + 1;
        int dealer2 = randGen.nextInt(10) + 1;

        System.out.println("~Baby Blackjack~");
        System.out.println("Highest total wins!\n");

        System.out.println("Your cards: " + user1 + " & " + user2);
        System.out.println("Dealer cards: " + dealer1 + " & " + dealer2);

        if ((user1 + user2) > (dealer1 + dealer2)) {
            System.out.println("\nWINNER!!");
        } else {
            System.out.println("\nLOSER");
        }
    }
}
