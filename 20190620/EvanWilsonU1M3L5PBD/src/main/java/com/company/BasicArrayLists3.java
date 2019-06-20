package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists3 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> oneThousandRandoms = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int randGen = rand.nextInt(99-10)+10;
            oneThousandRandoms.add(randGen);
        }
        for (int i = 0; i < 1000 ; i+=20) {
            System.out.format("%1$s%n", oneThousandRandoms.subList(i,i+20));
        }
    }
}
