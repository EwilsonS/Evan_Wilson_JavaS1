package com.company;

public class ComputerMouse {
    private String manufacturer;
    private String model;
    private int xPosition;
    private int yPosition;
    private int[] lastCheckedLocation;

    public ComputerMouse(
            String manufacturer,
            String model,
            int xPosition,
            int yPosition,
            int[] lastCheckedLocation
    ) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.lastCheckedLocation = lastCheckedLocation;
    }

    // Custom methods
    public void move(int deltaX, int deltaY) {
        this.xPosition += deltaX;
        this.yPosition += deltaY;
    }

    public void click(int[] pos){
        this.lastCheckedLocation = pos;
    }
    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int[] getLastClickedLocation() {
        return lastCheckedLocation;
    }

    public void setLastCheckedLocation(int[] lastCheckedLocation) {
        this.lastCheckedLocation = lastCheckedLocation;
    }
}
