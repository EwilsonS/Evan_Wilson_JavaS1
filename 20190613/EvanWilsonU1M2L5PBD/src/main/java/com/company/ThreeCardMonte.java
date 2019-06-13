package com.company;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner scan = new Scanner(System.in);
        Random randGen = new Random();
        try {


            int dealerNum = randGen.nextInt(3) + 1;

            // UNCOMMENT below to see random selection
            // System.out.println("Dealer Number: " + dealerNum);

            System.out.println("\n*********** GAME TIME!! ************");
            System.out.println("************************************");
            System.out.println("\nMake your selection, choose wisely.");
            System.out.println("" +
                    "      ___         ___         ___\n" +
                    "     /   \\       /   \\       /   \\\n" +
                    "    /  1  \\     /  2  \\     /  3  \\\n" +
                    "   /_______\\   /_______\\   /_______\\\n"
            );

            int userGuess = scan.nextInt();

            if (userGuess == dealerNum) {
                System.out.println("========== You chose cup " + userGuess + " =============");

                switch (dealerNum) {
                    case 1:
                        System.out.println("" +
                                "      ___        ___         ___\n" +
                                "    /*****\\     /   \\       /   \\\n" +
                                "   (YOU WIN)   /  2  \\     /  3  \\\n" +
                                "    \\*****/   /_______\\   /_______\\\n"
                        );
                        break;
                    case 2:
                        System.out.println("" +
                                "      ___         ___         ___\n" +
                                "     /   \\      /*****\\      /   \\\n" +
                                "    /  1  \\    (YOU WIN)    /  3  \\\n" +
                                "   /_______\\    \\*****/    /_______\\\n"
                        );
                        break;
                    case 3:
                        System.out.println("" +
                                "      ___          ___        ___\n" +
                                "     /   \\        /   \\     /*****\\\n" +
                                "    /  1  \\      /  2  \\   (YOU WIN)\n" +
                                "   /_______\\    /_______\\   \\*****/\n"
                        );
                        break;
                    default:

                }
                System.out.println("                CONGRATS!                   ");
                System.out.println("                GAME OVER                   ");

            } else {
                System.out.println("========== You chose cup " + userGuess + " =============");

                switch (userGuess) {
                    case 1:
                        System.out.println("" +
                                "      ___        ___         ___\n" +
                                "    /*****\\     /   \\       /   \\\n" +
                                "   ( LOSER )   /  2  \\     /  3  \\\n" +
                                "    \\*****/   /_______\\   /_______\\\n"
                        );
                        break;
                    case 2:
                        System.out.println("" +
                                "      ___         ___         ___\n" +
                                "     /   \\      /*****\\      /   \\\n" +
                                "    /  1  \\    ( LOSER )    /  3  \\\n" +
                                "   /_______\\    \\*****/    /_______\\\n"
                        );
                        break;
                    case 3:
                        System.out.println("" +
                                "      ___          ___        ___\n" +
                                "     /   \\        /   \\     /*****\\\n" +
                                "    /  1  \\      /  2  \\   ( LOSER )\n" +
                                "   /_______\\    /_______\\   \\*****/\n"
                        );
                        break;
                    default:
                        System.out.println("1-3 only please");
                        game();
                }
                System.out.println("               GAME OVER                   ");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nOnly enter 1, 2 or 3. Try again.\n");
            game();
        }
    }
}
