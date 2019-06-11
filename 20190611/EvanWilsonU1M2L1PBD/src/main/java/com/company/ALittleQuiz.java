package com.company;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer1;
        String answer2;
        String answer3;
        int score = 0;
        System.out.println("\nI want to play a game...\n");

        System.out.println("(Dramatic Music)");

        System.out.println("(Dramatic Music)");

        System.out.println("\nContinue?(Y or N)");
        String keepGoing;
        keepGoing = scan.nextLine().toUpperCase();
        if (keepGoing.equals("Y")) {
            System.out.println("\nAnswer the following questions correctly,\nYour life depends on it...\n");
        } else if (keepGoing.equals("N")) {
            System.out.println("Too bad, there's no turning back!\n");
        } else {
            System.out.println("I'll take that as a YES\n");
        }
        System.out.println("Ken Griffey Jr. & Ken Griffey Sr. played professional " +
                "baseball...\nA.) During the same season\nB.) For the same team\nC.) Both A and B\n");
        answer1 = scan.nextLine().toUpperCase();
        if (answer1.equals("C")) {
            System.out.println("Good! You know your Griffeys. You can live... for now\n");
            score++;
        } else {
            System.out.println("WRONG!\n");
            System.out.println("(Door slams! Faint screams in the background)\n");
        }
        System.out.println("Gibson and Fender are most famous for making..." +
                "\nA.) Automobiles\nB.) Guitars\nC.) Cookware");
        answer2 = scan.nextLine().toUpperCase();
        if (answer2.equals("B")) {
            System.out.println("Correct, but you're not safe yet!\n");
            score++;
        } else {
            System.out.println("WRONG!\n");
            System.out.println("(Shadowy figure sharpens pendulum edge)\n");
        }
        System.out.println("What does puerile mean?" +
                "\nA.) Lacking maturity\nB.) Extremely introverted\nC.) Oblivious to convention or morality");
        answer3 = scan.nextLine().toUpperCase();
        if (answer3.equals("A")) {
            System.out.println("\nCorrect, You may live!");
            score++;
        } else {
            System.out.println("WRONG!\n");
            System.out.println("(Trap door)\n");
            System.out.println("(Two hungry bears fight over dinner)\n");
        }

        System.out.format("***Your score is " + score + " out of 3***\n");
    }

}
