package com.company;

import com.company.interfaces.Vehicle;

public class Car implements Vehicle {

    private String make;
    private String modael;
    private int milesTraveled;

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModael() {
        return modael;
    }

    public void setModael(String modael) {
        this.modael = modael;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public void drive(int miles) {

    }

    public void displayMilesTraveled() {

    }
}
