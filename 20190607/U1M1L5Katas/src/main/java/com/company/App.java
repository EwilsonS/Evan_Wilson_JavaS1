package com.company;

public class App {
/*- **Subtract Two**: Create a method called `subtract` that takes two int parameters (a and b) and returns the value
      of b subtracted from a.
- **Subtract or Zero**: Create a method called `subtractOrZero` that takes two int parameters (a and b) and returns
    the value of b subtracted from a, unless the result is less than zero, in which case, return 0.
- **Max**: Create a method called `max` that takes three int parameters (a, b, and c) and returns the value of
    the largest of the three.
- **Min**: Create a method called `min` that takes three int parameters (a, b, and c) and returns the value of
    the smallest of the three.
- **isLarger**: Create a method called `isLarger` that takes two int parameters (first and second) and returns true
    if the first is greater than second.
*/

    public static void main(String[] args) {

    }

    public static boolean isLarger(int first, int second) {

        return first > second;
    }

    public static int min(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {
        } else {
            min = c;
        }
        return min;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtractOrZero(int a, int b) {
        if (a - b > 0)
            return a - b;
        else
            return 0;
    }

    public static int max(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max > c) {
        } else {
            max = c;
        }
        return max;
    }


}
