package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args) {
        Random rand = new Random();
        // Create an ArrayList of Integers
        List<Integer> tenRandoms = new ArrayList<>();

        // Fill the ArrayList with ten random numbers (1-100)
        for (int i = 0; i < 10; i++) {
            int randGen = rand.nextInt(100)+1;
            tenRandoms.add(randGen);
        }

        // Copy each value from the ArrayList into another ArrayList of the same capacity
        List<Integer> tenRandomsCopy = new ArrayList<>(tenRandoms);

        // Change the last value in the first ArrayList to a -7
       tenRandoms.set(9, -7);

       // Display the contents of both ArrayLists
        System.out.println(tenRandoms);
        System.out.println(tenRandomsCopy);
    }
}
