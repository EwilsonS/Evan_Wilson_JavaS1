package com.company;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        // Your code must declare the following array [1, 2, 3, 4, 5]
        int[] arr = {1, 2, 3, 4, 5};
        int start = arr.length - 1;

        // create another array of equal length
        int[] revArr = new int[arr.length];

        // fill that array with values from the original array but in reverse order
        for (int i = 0; i < revArr.length; i++) {
            for (int j = start; j >= 0; j--) {
                revArr[i] = arr[j];
                start--;
                break;
            }
        }
        // Finally, your code must print the contents of both arrays to the screen.
        for (int element : arr) {
            System.out.println(element);
        }

        System.out.println();

        for (int element : revArr) {
            System.out.println(element);
        }
    }
}
