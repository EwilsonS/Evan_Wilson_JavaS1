package com.company.concreteapproach;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
