package com.company;

public class Constable extends Character{

    private String jurisdiction;

    // Constructor using super and some unique props
    public Constable(String name, int strength, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name, strength, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
    }

    //Unique methods for constable
    public void arrest(){
        System.out.println("Constable makes an arrest");
    }

    // Getter and setter for private attributes
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

}
