package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        List<String> str = new LinkedList<>();
        str.add("First");
        str.add("Second");
        str.add("Third");
        str.add("Fourth");
        str.add("Fifth");
        str.add("Sixth");
        str.add("Seventh");
        str.add("Eighth");

        System.out.println("\n==== Total =====");
        System.out.println(total(nums));
        System.out.println("\n==== Total even =====");
        System.out.println(totalEven(nums));
        System.out.println("\n==== Swap first and last =====");
        System.out.println(swapFirstAndLast(str));
        System.out.println("\n==== Reverse=====");
        System.out.println(reverse(nums));
        System.out.println("\n==== Less than 5=====");
        System.out.println(lessThanFive(nums));

    }

    public static int total(List<Integer> numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int totalEven(List<Integer> numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.size(); i += 2) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static List<String> swapFirstAndLast(List<String> strings) {

        String temp = strings.get(0);
        String temp2 = strings.get(strings.size() - 1);

        strings.set(0, temp2);
        strings.set(strings.size() - 1, temp);


        return strings;
    }

    public static List<Integer> reverse(List<Integer> numbers) {

        List<Integer> reversed = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {

            // length - (i + 1) is the n-th to last element
            // so when i = 0, it would be the last element
            // when i = 3, it would be the fourth to last element since i=3 is the 4th element, etc
            reversed.add(numbers.get(i));
        }

        return reversed;
    }

    public static List<Integer> lessThanFive(List<Integer> numbers) {

        int numLessThanFive = 0;

        for (Integer num : numbers) {
            if (num < 5) {
                numLessThanFive++;
            }
        }

        if (numLessThanFive == 0) {
            return null;
        }

        List<Integer> lessThan = new ArrayList<>();

        for (int i = numbers.size()-1; i >=0; i--) {
            if (numbers.get(i) < 5) {

                // subtracting numLessThanFive from length then decrementing numLessThanFive
                // allows us to go from 0 to length - 1 in order without additional variables
                lessThan.add(numbers.get(i));
                numLessThanFive--;
            }
        }

        return reverse(lessThan);
    }
}
