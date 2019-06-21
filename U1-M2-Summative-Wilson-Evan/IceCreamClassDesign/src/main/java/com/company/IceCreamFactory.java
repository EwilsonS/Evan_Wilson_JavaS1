package com.company;

public class IceCreamFactory {
    private int quantityHalfGal;
    private int quantityGal;
    private int quantityFiveGal;
    private String flavor;
    private String buyer;
    private String deliveryCo;
    private boolean wholesaleDiscount;

    public int getQuantityHalfGal() {
        return quantityHalfGal;
    }

    public void setQuantityHalfGal(int quantityHalfGal) {
        this.quantityHalfGal = quantityHalfGal;
    }

    public int getQuantityGal() {
        return quantityGal;
    }

    public void setQuantityGal(int quantityGal) {
        this.quantityGal = quantityGal;
    }

    public int getQuantityFiveGal() {
        return quantityFiveGal;
    }

    public void setQuantityFiveGal(int quantityFiveGal) {
        this.quantityFiveGal = quantityFiveGal;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getDeliveryCo() {
        return deliveryCo;
    }

    public void setDeliveryCo(String deliveryCo) {
        this.deliveryCo = deliveryCo;
    }

    public boolean isWholesaleDiscount() {
        return wholesaleDiscount;
    }

    public void setWholesaleDiscount(boolean wholesaleDiscount) {
        this.wholesaleDiscount = wholesaleDiscount;
    }
}
