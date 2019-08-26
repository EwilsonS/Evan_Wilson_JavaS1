package com.company.concreteapproach;

public class Square extends Shape {

    private int sideLen;

    public int getSideLen() {
        return sideLen;
    }

    public void setSideLen(int sideLen) {
        this.sideLen = sideLen;
    }

    public double area() {
        return sideLen * sideLen;
    }

    public double perimeter() {
        return 4 * sideLen;
    }

}
