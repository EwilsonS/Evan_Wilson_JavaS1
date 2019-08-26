package com.company;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayLists1 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);
        nums.add(-113);

        List<Integer> nums2 = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            nums2.add(-113);
            System.out.println("Slot " + i + " contains a " + nums2.get(i));
        }
    }
}
