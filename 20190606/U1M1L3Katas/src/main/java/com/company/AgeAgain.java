package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hi, How old are you?");
        int age = Integer.parseInt(myScanner.nextLine());

        if(age < 14){
            System.out.println("What grade are you in?");
            String grade = myScanner.nextLine();
            System.out.println("Wow! " + grade + " grade - that sounds exciting!");
        }else if(age >= 14 && age <= 18){
            System.out.println("Are you going to college?");
            String answer = myScanner.nextLine().toLowerCase();
            if(answer.equals("yes")){
                System.out.println("Where?");
                String college= myScanner.nextLine();
                System.out.println(college + " is a great school!");

            }else{
                System.out.println("Whats next, then?");
                String next = myScanner.nextLine();
                System.out.println("Wow, "+next+" sounds like a plan!");
            }
        }else if(age >= 18){
            System.out.println("What is your job?");
            String job= myScanner.nextLine();
            System.out.println(job + " sounds like a great job!");
        }


    }
}
