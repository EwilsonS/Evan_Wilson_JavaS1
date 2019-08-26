package com.company;

public class IceCreamShop {
    private int numScoops;
    private String coneType;
    private String addOns;
    private String flavor;
    private float price;
    private boolean member;

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void setNumScoops(int numScoops) {
        this.numScoops = numScoops;
    }

    public String getConeType() {
        return coneType;
    }

    public void setConeType(String coneType) {
        this.coneType = coneType;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
}
