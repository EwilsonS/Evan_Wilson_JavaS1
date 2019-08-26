package com.company;

import java.util.Random;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
    /*
    Bonus
    Prompt the user for the number of times to roll the dice.
    Keep track of and display this information for all numbers that can be rolled (2–12).
   */

        Random randGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many rolls would you like?");
        int numRolls = myScanner.nextInt();
        System.out.println("You chose " + numRolls + " roll(s). \n=================");

        int dieOne;
        int dieTwo;
        int count = 0;


        for (int i = 0; i < numRolls; i++) {
            dieOne = randGenerator.nextInt(6) + 1;
            dieTwo = randGenerator.nextInt(6) + 1;
            int sum = dieOne + dieTwo;

            if (sum == 7 && count == 0) {
                if (i == 0) {
                    System.out.println("It took " + (i + 1) + " roll to get the first SEVEN");
                } else {
                    System.out.println("It took " + (i + 1) + " roll(s) to get the first SEVEN");
                }
                count++;
            } else if (sum == 7 && count != 0) {
                count++;
            }
            System.out.println("Roll No." + (i + 1) + ": " + sum + "(" + dieOne + "+" + dieTwo +")");
        }
        if (count == 1) {
            System.out.println("You rolled SEVEN : " + count + " time!");
        } else if(count > 1){
            System.out.println("You rolled SEVEN : " + count + " times!");
        }else {
            System.out.println("You did not roll any SEVENS");
        }
    }
}


