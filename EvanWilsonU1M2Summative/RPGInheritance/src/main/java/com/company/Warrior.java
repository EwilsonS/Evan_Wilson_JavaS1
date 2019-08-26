package com.company;

public class Warrior extends Character{

    public int shieldStrength;

    // Constructor using super and locals
    public Warrior(String name, int strength, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, strength, stamina, speed, attackPower);
        this.shieldStrength = shieldStrength;
    }

    // Custom methods for warrior
    protected void decreaseShieldStrength(){
        System.out.println("Warrior shield strength decreased");
    }


    // Getter and setter
    public int getShieldStrength() {
        System.out.println("Getting warrior shield strength");
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

}
