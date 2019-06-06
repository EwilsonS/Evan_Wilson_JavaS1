package com.company;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        /*
        Write a Java program that calculates and displays the mortgage payment amount given the following:
        The amount of the mortgage
        The term of the mortgage
        The annual interest rate of the mortgage

        The following formula is used to calculate the fixed monthly payment (P)
        required to fully amortize a loan of L dollars over a term of n months at a
        monthly interest rate of c. [If the quoted rate is 6%, for example, c is .06/12 or .005].
        payment = mortgage[rate(1 + rate)^months]/[(1 + rate)^months - 1]
        */
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How much is your total mortgage?");
        int mortgage = myScanner.nextInt();

        System.out.println("How many months is your term?");
        int months = myScanner.nextInt();

        System.out.println("What is the annual interest rate?");
        double rate = (myScanner.nextFloat()/100)/12;
        double ratePlusOne = rate + 1;
        double innerMathTimesRate = rate * (Math.pow(ratePlusOne,months));
        double leftSide = mortgage * innerMathTimesRate;
        double rightSide= (Math.pow(ratePlusOne,months)-1);
        double payment = (leftSide)/(rightSide);

        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("============Your Info===============");
        System.out.println("====================================");
        System.out.println("Mortgage................." + mortgage);
        System.out.println("Term....................." + months + " months");
        System.out.format("Monthly Rate.............%.8f\n", rate);
        System.out.println("------------------------------------");
        System.out.format("Your monthly payment is: $%.3f", payment);
        System.out.println("\n");
    }
}
