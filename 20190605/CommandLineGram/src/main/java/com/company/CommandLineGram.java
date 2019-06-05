package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {
        /*
        The purpose of this program is to prompt the user for registration
        information for a new social media service called CommandLineGram.
        The program must prompt the user for the following information and
        then display it, nicely formatted, back to the user after all the
        information has been collected:
         */
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = myScanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = myScanner.nextLine();

        System.out.println("Enter email: ");
        String email = myScanner.nextLine();

        System.out.println("Twitter: ");
        String twitter = myScanner.nextLine();

        System.out.println("How old are you? ");
        int age = Integer.parseInt(myScanner.nextLine());

        System.out.println("Where ya from? ");
        String country = myScanner.nextLine();

        System.out.println("What do you do for a living? ");
        String job = myScanner.nextLine();

        System.out.println("Favorite OS?");
        String os = myScanner.nextLine();

        System.out.println("Favorite programing language? ");
        String language = myScanner.nextLine();

        System.out.println("Favorite computer scientist");
        String scientist = myScanner.nextLine();


        System.out.println("Favorite keyboard shortcut");
        String shortcut = myScanner.nextLine();

        System.out.println("Have you built a computer before (true/false)? ");
        String builtCpu = myScanner.nextLine();

        System.out.println("Who's your fave super hero and why? ");
        String superHero = myScanner.nextLine();

        System.out.println(
                "|=============================================" + "\n" +
                        "| First......................... " + firstName + "\n" +
                        "| Last.......................... " + lastName + "\n" +
                        "| Email......................... " + email + "\n" +
                        "| Twitter....................... " + twitter + "\n" +
                        "| Age........................... " + age + "\n" +
                        "| Country....................... " + country + "\n" +
                        "| Occupation.................... " + job + "\n" +
                        "| I have built a computer....... " + builtCpu + "\n" +
                        "| Favorite Hero................. " + superHero + "\n" +
                        "| Fave OS....................... " + os + "\n" +
                        "| Fave programming language..... " + language + "\n" +
                        "| Fave computer scientist....... " + scientist + "\n" +
                        "| Most used keyboard shortcut... " + shortcut + "\n" +
                        "|==============================================" + "\n"
        );

    }
}
