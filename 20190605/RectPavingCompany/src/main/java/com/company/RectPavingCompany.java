package com.company;

import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {
        //The purpose of the program is to calculate the total cost to pave a driveway.

        Scanner myScanner = new Scanner(System.in);

        //prompt the user for the width of the driveway as an integer (in feet).
        System.out.println("Enter driveway width:");
        double driveWidth = Double.parseDouble(myScanner.nextLine());

        //prompt the user for the length of the driveway as an integer (in feet).
        System.out.println("Enter driveway length:");
        double driveLength = Double.parseDouble(myScanner.nextLine());

        //calculate and display the area of the driveway.
        double driveArea = driveLength * driveWidth;
        System.out.println("_________________________________________________");
        System.out.println("|Area of driveway............... " + driveArea + " sq ft.");

        //calculate and display the perimeter of the driveway.
        double drivePerimeter = driveLength + driveLength + driveWidth + driveWidth;
        System.out.println("|Perimeter of driveway.......... " + drivePerimeter + " ft.");
        //Based on the area and perimeter, it must calculate the total cost of the driveway:
        //The cement for the driveway cost $12.50/square foot.
        //The framing/footers for the driveway cost $8.25/linear foot.

        //The program must calculate and display the subtotal cost of the cement.
        double cementCost = driveArea * 12.50;
        System.out.format("|Cost of cement................. %.2f \n", cementCost);

        //The program must calculate and display the subtotal cost of the framing/footers.
        double frameCost = drivePerimeter * 8.25;
        System.out.format("|Cost of framing/footers........ %.2f \n", frameCost);
        System.out.println("|_________________________________________________");


        //Version 2
        //Prompts the user for the cost of cement
        System.out.println("Enter the cost of cement (found above):");
        double cementTotal = Double.parseDouble(myScanner.nextLine());

        //Prompts the user for the cost of the framing/footers
        System.out.println("Enter the cost of framing/footers(found above):");
        double frameTotal = Double.parseDouble(myScanner.nextLine());

        //Calculates and displays the subtotal cost of the cement and framing/footers as in previous version.
        System.out.println("==================================================");
        System.out.println("Total: " + (cementTotal + frameTotal));
        System.out.println("Thank You!!");
        System.out.println("\n");
        System.out.println("\n");

    }
}