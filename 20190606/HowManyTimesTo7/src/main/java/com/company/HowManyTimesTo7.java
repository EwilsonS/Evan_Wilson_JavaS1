package com.company;

import java.util.Random;

public class HowManyTimesTo7 {
    public static void main(String[] args) {
        /*
        The program will "roll" a pair of virtual dice (use the random number generator)
        100 times and keep track of the following:
        How many rolls it took to roll the first 7
        The total number of 7s rolled out of the 100 rolls
        This information must be displayed to the user after it has been calculated.
         */

        Random randGenerator = new Random();

        int dieOne;
        int dieTwo;
        int count = 0;


        for (int i = 0; i < 100; i++) {
            dieOne = randGenerator.nextInt(6) + 1;
            dieTwo = randGenerator.nextInt(6) + 1;
            int sum = dieOne + dieTwo;

            if (sum == 7 && count == 0) {
                System.out.println("It took " + i + " roll(s) to get the first SEVEN");
                count++;
            }else if (sum == 7 && count != 0) {
                count++;
            }
            //System.out.println(sum);
        }
        System.out.println("You rolled SEVEN : " + count + " times!");

    }
}
