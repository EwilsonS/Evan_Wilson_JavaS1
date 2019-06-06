package com.company;
import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {

        /*
        Run the program and examine the code to get familiar with what it does.
        Come up with some simple test cases and work out their expected values.
        Run the program again and compare actual results with your expected results.
        Use the debugger to help you figure out what is wrong with the code.
        Fix the errors, noting the line number where each error occurred and what you did to fix it.

        line 35: Wrong variable name. Changed cementCost to framingCost
        line 38: changed operator to +
        line 44: changed changed operator to *
*/

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the width of the driveway in feet? ");
        int width = Integer.parseInt(scan.nextLine());

        System.out.print("What is the length of the driveway in feet? ");
        int length = Integer.parseInt(scan.nextLine());

        float cementCost = 0.0f;
        float framingCost = 0.0f;

        System.out.print("What is the cost of cement per square foot? ");
        cementCost = Float.parseFloat(scan.nextLine());

        System.out.print("What is the cost of framing/footers per linear foot? ");
        framingCost = Float.parseFloat(scan.nextLine());

        int area = length * width;
        int perimeter = 2*length + 2*width;

        System.out.format("The area of the driveway is %d square feet.%n", area);
        System.out.format("The perimeter of the driveway is %d feet.%n", perimeter);

        System.out.format("The cost of the cement is %f.%n", area*cementCost);
        System.out.format("The cost of the framing/footers is %f.%n", perimeter*framingCost);
    }
}
