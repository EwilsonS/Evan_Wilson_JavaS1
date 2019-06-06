package com.company;

import java.util.Scanner;

public class FavoriteProgrammingLanguage {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner((System.in));
        System.out.println("Fave prog lang?");
        String userInput = myScanner.nextLine().toLowerCase();
        while(!userInput.equals("java")){
            if(!userInput.equals("java")){
                System.out.println("Try again");
                userInput = myScanner.nextLine().toLowerCase();
                continue;
            }else{
                break;
            }
        }
        System.out.println("That's what I was looking for! Java is definitely the answer!");


    }
}
