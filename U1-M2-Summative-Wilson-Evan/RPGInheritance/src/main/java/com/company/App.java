package com.company;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {

        // Instantiate new players
        Farmer farmer = new Farmer("Farmer Joe", 75, 75, 10,1);
        Warrior warrior = new Warrior("Warrior Joe", 75,100,50,10,100);
        Constable constable = new Constable("Constable Joe", 60,60,20,5,"UNCC");

        // Get player stat sheet
        farmer.getInfo();
        warrior.getInfo();
        System.out.println("Shield strength: " + warrior.getShieldStrength());
        constable.getInfo();
        System.out.println("Jurisdiction: " + constable.getJurisdiction());

        //check unique methods
        System.out.println();
        farmer.plow();
        farmer.harvest();

        constable.arrest();

        warrior.decreaseShieldStrength();

        System.out.println();
    }
}
