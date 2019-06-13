package com.company.interfaces;

import java.util.Scanner;

public class BetterInput implements UserIO {

    Scanner scan = new Scanner(System.in);

    public int readInt(String prompt) {
        System.out.println(prompt);
        return scan.nextInt();
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        return scan.nextLong();
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        return scan.nextDouble();
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        return scan.nextFloat();
    }

    public String readString(String prompt) {
        scan.nextLine();
        System.out.println(prompt);

        return scan.nextLine();
    }
}
