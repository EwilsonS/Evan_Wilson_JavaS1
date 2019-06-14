package com.company;

public class Home {
    private String owner;
    private double[] coordinates;
    private String address;

    Home(String owner, double[] coordinates, String address){
        this.owner = owner;
        this.coordinates = coordinates;
        this.address = address;
    }
    private Patio patio;

    private Bathroom bathroom;
    private Basement basement;




    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }


}
