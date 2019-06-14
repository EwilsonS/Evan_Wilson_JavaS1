package com.company;

public class OpticalDrive {
    private boolean cd;
    private boolean dvd;
    private boolean blueRay;

    public OpticalDrive(boolean cd, boolean dvd, boolean blueRay) {
        this.cd = cd;
        this.dvd = dvd;
        this.blueRay = blueRay;
    }

    public boolean isCd() {
        return cd;
    }

    public void setCd(boolean cd) {
        this.cd = cd;
    }

    public boolean isDvd() {
        return dvd;
    }

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }

    public boolean isBlueRay() {
        return blueRay;
    }

    public void setBlueRay(boolean blueRay) {
        this.blueRay = blueRay;
    }
}
