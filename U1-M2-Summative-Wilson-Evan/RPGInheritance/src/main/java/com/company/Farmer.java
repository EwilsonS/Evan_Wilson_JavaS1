package com.company;

public class Farmer extends Character{

    // Constructor using info in superclass
    public Farmer(String name, int strength, int stamina, int speed, int attackPower) {
        super(name, strength, stamina, speed, attackPower);
    }

    // Methods unique to farmer
    public void plow(){
        System.out.println("Farmer plows");
    }
    public void harvest(){
        System.out.println("Farmer harvests");
    }
}
