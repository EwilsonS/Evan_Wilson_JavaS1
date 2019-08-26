package com.company;

import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {
        //The purpose of this program is to calculate how much luxury
        //tax a hypothetical sports team will pay to sign three players.

        Scanner myScanner = new Scanner(System.in);


        //prompt the user to enter the salary for Player 1 (without the dollar sign or commas).
        System.out.println("Enter salary for Player 1 (ex. 18750000):");
        int player1Salary = Integer.parseInt(myScanner.nextLine());

        //Prompt the user to enter the salary for Player 2 (without the dollar sign or commas).
        System.out.println("Enter salary for Player 2:");
        int player2Salary = Integer.parseInt(myScanner.nextLine());

        //Prompt the user to enter the salary for Player 3 (without the dollar sign or commas).
        System.out.println("Enter salary for Player 3:");
        int player3Salary = Integer.parseInt(myScanner.nextLine());

        //Calculate and display the total salary for all three players.
        int allSalaries = player1Salary + player2Salary + player3Salary;
        System.out.println("Combined salaries total: " + "$" + allSalaries);

        //If the team went over their spending limit, calculate and display the cost of the luxury tax.
        //The team's spending limit is $40,000,000.
        //The tax rate is 18%.
        int limit = 40000000;
        if (allSalaries > limit) {
            int taxable = allSalaries - limit;
            float taxes = taxable * .18f;
            System.out.format("Your luxury tax is....... **$%.0f** ", taxes);
        }
        if(allSalaries <= limit){
            System.out.println("Great job managing your team! You deserve a promotion");
        }
    }
}