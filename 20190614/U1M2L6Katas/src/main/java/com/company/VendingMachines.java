package com.company;

public class VendingMachines extends Store{
    private String mints;
    private String gum;
    private String popcorn;

    public String getMints() {
        return mints;
    }

    public void setMints(String mints) {
        this.mints = mints;
    }

    public String getGum() {
        return gum;
    }

    public void setGum(String gum) {
        this.gum = gum;
    }

    public String getPopcorn() {
        return popcorn;
    }

    public void setPopcorn(String popcorn) {
        this.popcorn = popcorn;
    }
}
