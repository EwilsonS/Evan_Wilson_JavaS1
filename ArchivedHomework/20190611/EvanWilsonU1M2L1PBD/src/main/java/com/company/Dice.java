package com.company;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(6) + 1;
        System.out.println(randInt);

        int randInt2 = randomGenerator.nextInt(6) + 1;
        System.out.println(randInt2);
        System.out.println("total " + (randInt+randInt2));
    }
}

