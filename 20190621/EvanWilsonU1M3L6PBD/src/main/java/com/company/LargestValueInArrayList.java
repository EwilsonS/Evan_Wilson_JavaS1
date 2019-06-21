package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LargestValueInArrayList {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randGen = rand.nextInt(100)+1;
            nums.add(randGen);
        }
        System.out.println("ArrayList: " + nums);

        // Use the stream and lambdas to find the max number
        int maxNum =
        nums
                .stream()
                .mapToInt(x->x)
                .max()
                .getAsInt();
        System.out.println("Largest value: " + maxNum);
    }
}
