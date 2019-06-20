package com.company;

import java.util.*;

public class ArrayListThereOrNot {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> tenRandoms = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randGen = rand.nextInt(50)+1;
            tenRandoms.add(randGen);
        }
        boolean restart;
        do {
            restart = false;
            System.out.println("ArrayList: " + tenRandoms);

            Scanner scan = new Scanner(System.in);
            try {
                System.out.printf("Value to find: ");
                int userInt = scan.nextInt();

                if (tenRandoms.contains(userInt)) {
                    System.out.println("\n" + userInt + " is in the ArrayList");
                }else{
                    System.out.println("\n" + userInt + " is not in the ArrayList");
                }
            } catch (Exception e) {
                System.out.println("\nInvalid entry\n");
                restart = true;
            }
        }while (restart);
    }
}
