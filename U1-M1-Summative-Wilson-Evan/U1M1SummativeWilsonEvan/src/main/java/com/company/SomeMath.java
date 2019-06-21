package com.company;

public class SomeMath {
    public static void main(String[] args) {
        System.out.println(total5(1, 2, 3, 4, 5));
        System.out.println(average5(1, 3, 5, 7, 9));
        System.out.println(largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }

    /*
     Create a method called total5.  This method must take 5 int parameters and return the total.
     You must call the method with the following parameters and print the returned total to the
     screen: 1, 2, 3, 4, 5.
    */
    public static int total5(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    /*
     Create a method called average5. This method must take 5 int parameters and return the average
     of the numbers as a double. You must call the method with the following parameters and print the
     returned average to the screen: 1, 3, 5, 7, 9.
    */
    public static int average5(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }

    /*
     Create a method called largest5. This method must take 5 double parameters and return the
     largest. You must call the method with the following parameters and print the returned
     value to the screen: 42.0, 35.1, 2.3, 40.2, 15.6.
     */
    public static double largest5(double a, double b, double c, double d, double e) {
        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }

        return max;
    }

}
