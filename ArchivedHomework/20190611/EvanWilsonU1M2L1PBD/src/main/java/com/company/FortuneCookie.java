package com.company;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] fortunes = {
                "Love yourself best of all",
                "Be the lion",
                "Today will be a good day",
                "You will find advice from an unlikely source",
                "A cold shower provides a clear mind",
                "Be generous with good grades"
        };

        System.out.println(fortunes[rand.nextInt(6)]);
        System.out.println((rand.nextInt(54) + 1) + " - " + (rand.nextInt(54) + 1)
                + " - " + (rand.nextInt(54) + 1)+ " - " + (rand.nextInt(54) + 1)
                + " - " + (rand.nextInt(54) + 1) + " - " + (rand.nextInt(54) + 1));

    }
}
