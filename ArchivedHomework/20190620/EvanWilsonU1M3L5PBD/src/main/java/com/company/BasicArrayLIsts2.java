package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLIsts2 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> tenRandoms = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randGen = rand.nextInt(100)+1;
            tenRandoms.add(randGen);
        }
        System.out.println(tenRandoms);
    }
}
