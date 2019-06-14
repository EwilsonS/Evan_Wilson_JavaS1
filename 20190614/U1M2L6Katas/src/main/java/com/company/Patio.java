package com.company;

public class Patio {
    private Boolean covered;
    private int[] dimentions;

    public Patio(Boolean covered, int[] dimentions) {
        this.covered = covered;
        this.dimentions = dimentions;
    }

    public Boolean getCovered() {
        return covered;
    }

    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    public int[] getDimentions() {
        return dimentions;
    }

    public void setDimentions(int[] dimentions) {
        this.dimentions = dimentions;
    }
}
