package com.company;

public class App {
    public static void main(String[] args) {
        String[] a = {"8", "1", "2", "3", "4", "5", "6","7"};
        System.out.println(evensAndOdds(a));

    }

    public static int total(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = num + sum;
        }
        return sum;
    }

    public static int totalOdd(int[] arr) {
        int sumOdd = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            sumOdd = sumOdd + arr[i];
        }
        return sumOdd;
    }

    public static int totalEven(int[] arr) {
        int sumEven = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            sumEven = sumEven + arr[i];
        }
        return sumEven;
    }

    public static int secondLargestNumber(int[] arr) {
        int max;
        int max2;
        if (arr.length < 2) {
            System.out.println("Invalid Array Length");
            return 0;
        }
        if (arr[1] > arr[0]) {
            max = arr[1];
            max2 = arr[0];
        } else {
            max = arr[0];
            max2 = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static String[] swapFirstAndLast(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;

    }

    public static int[] reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        int start = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = start; j >= 0; j--) {
                arr2[i] = arr[j];
                start--;
                break;
            }
        }
        System.out.println(arr2);
        return arr2;
    }

    public static String concatenateString(String[] arr) {
        String concat = "";
        String temp = "";

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
            concat = temp;
        }
        return concat;
    }

    public static int[] everyThird(int[] arr) {
        if (arr.length < 3) {
            return null;
        } else {
            int[] newArr = new int[arr.length / 3];
            int start = 2;
            for (int i = 0; i < newArr.length; i++) {
                for (int j = start; j < arr.length; j = j + 3) {
                    newArr[i] = arr[j];
                    start = start + 3;
                    break;
                }
            }
            return newArr;
        }
    }

    public static int[] lessThanFive(int[] arr) {
        int size = 0;
        int startA = 0;

        // Get size for new array
        for (int i = startA; i < arr.length; i++) {
            if (arr[i] < 5) {
                size++;
                startA++;
                continue;
            } else {
                continue;
            }
        }

        //assign low values to new array
        int[] newArr = new int[size];
        int startB = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = startB; j < arr.length; j++) {
                if (arr[j] < 5) {
                    newArr[i] = arr[j];
                    startB++;
                    break;
                }
                startB++;
                continue;
            }
        }
        if (size == 0) {
            return null;
        }
        return newArr;
    }

    public static int[][] splitAtFive(int[] arr) {
         /*This method should split the array into two new arrays,
           one holding the values less than 5 and the other holding
           the values equal to or greater than 5.
          */

        int lowSize = 0;
        int highSize = 0;
        int startA = 0;

        // Get sizes for new arrays
        for (int i = startA; i < arr.length; i++) {
            if (arr[i] < 5) {
                lowSize++;
                startA++;
                continue;
            } else {
                highSize++;
                continue;
            }
        }
        //assign low values to new array
        int[] lowArr = new int[lowSize];
        int startB = 0;
        for (int i = 0; i < lowArr.length; i++) {
            for (int j = startB; j < arr.length; j++) {
                if (arr[j] < 5) {
                    lowArr[i] = arr[j];
                    startB++;
                    break;
                }
                startB++;
                continue;
            }
        }

        //assign high values to new array
        int[] highArr = new int[highSize];
        int startC = 0;
        for (int i = 0; i < highArr.length; i++) {
            for (int j = startC; j < arr.length; j++) {
                if (arr[j] >= 5) {
                    highArr[i] = arr[j];
                    startC++;
                    break;
                }
                startC++;
                continue;
            }
        }
        // Return a two-dimensional array, with the small-value array first.
        int[][] twoDimensional = {lowArr, highArr};
        return twoDimensional;
    }

    public static String[][] evensAndOdds(String[] arr) {
        int evenSize = 0;
        int oddSize = 0;

        // get array sizes
        for (int i = 0; i < arr.length; i++) {
            if(i==0 || i%2==0){
                evenSize++;
                continue;
            }else{
                oddSize++;
                continue;
            }
        }

        String[] evenArr = new String[evenSize];
        String[] oddArr = new String[oddSize];

        int startEven = 0;
        int startOdd = 1;

        // Separate even indices
        for (int i = 0; i < evenArr.length; i++) {
            for (int j = startEven; j < arr.length; j = j + 2) {
                evenArr[i] = arr[j];
                startEven = startEven + 2;
                break;
            }
        }

        // Separate odd indices
        for (int i = 0; i < oddArr.length; i++) {
            for (int j = startOdd; j < arr.length; j = j + 2) {
                oddArr[i] = arr[j];
                startOdd = startOdd + 2;
                break;
            }
        }
        String[][] both = {evenArr, oddArr};
        return both;
    }

}