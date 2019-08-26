package com.company;

public class Bathroom {
    private int numSinks;
    private boolean closet;
    private String bathType;

    public int getNumSinks() {
        return numSinks;
    }

    public void setNumSinks(int numSinks) {
        this.numSinks = numSinks;
    }

    public boolean isCloset() {
        return closet;
    }

    public void setCloset(boolean closet) {
        this.closet = closet;
    }

    public String getBathType() {
        return bathType;
    }

    public void setBathType(String bathType) {
        this.bathType = bathType;
    }
}
