package com.company.interfaces;

import java.util.Scanner;

public class BetterInput implements UserIO {

    Scanner scan = new Scanner(System.in);

    public int readInt(String prompt) {
        Scanner scan = new Scanner(System.in);

        System.out.println(prompt);
        try
        {
            return scan.nextInt();
        }catch (java.util.InputMismatchException ex){

            return readInt(prompt);
        }
    }


    public long readLong(String prompt) {
        Scanner scan = new Scanner(System.in);

        System.out.println(prompt);
        try
        {
            return scan.nextLong();
        }catch (java.util.InputMismatchException ex){

            return readLong(prompt);
        }
    }

    public double readDouble(String prompt) {
        Scanner scan = new Scanner(System.in);

        System.out.println(prompt);
        try
        {
            return scan.nextDouble();
        }catch (java.util.InputMismatchException ex){

            return readDouble(prompt);
        }
    }

    public float readFloat(String prompt) {
        Scanner scan = new Scanner(System.in);

        System.out.println(prompt);
        try
        {
            return scan.nextFloat();
        }catch (java.util.InputMismatchException ex){

            return readFloat(prompt);
        }
    }

    public String readString(String prompt) {
        Scanner scan = new Scanner(System.in);

        System.out.println(prompt);
        try
        {
            return scan.nextLine();
        }catch (java.util.InputMismatchException ex){

            return readString(prompt);
        }
    }
}
