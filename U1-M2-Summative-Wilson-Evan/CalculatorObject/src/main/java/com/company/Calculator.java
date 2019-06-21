package com.company;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(1, 1);
        calc.subtract(23, 52);
        calc.mult(34, 2);
        calc.divide(12, 3);

        calc.divide(12, 7 );
        calc.add(3.4, 2.3);
        calc.mult(6.7, 4.4);
        calc.subtract(5.5, 0.5);
        calc.divide(10.8, 2.2);
    }

    // Int operations
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public void subtract(int a, int b) {
        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);
    }

    public void mult(int a, int b) {
        int product = a * b;
        System.out.println(a + " * " + b + " = " + product);
    }

    public void divide(int a, int b) {
        int quotient = a / b;
        System.out.println(a + " / " + b + " = " + quotient);
    }

    // Double Operations
    public void add(double a, double b) {
        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public void subtract(double a, double b) {
        double difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);
    }

    public void mult(double a, double b) {
        double product = a * b;
        System.out.println(a + " * " + b + " = " + product);
    }

    public void divide(double a, double b) {
        double quotient = a / b;
        System.out.format("%s / %s = %.2f%n", a, b, quotient);
    }
}
