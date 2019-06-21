package com.company;

public class Character implements Ability{

    // Attributes that all characters share
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    // Initial build for all characters. Each new character begins with 100 health,
    // the rest to be set using the setters below
    public Character(String name, int strength, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = 100;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    // Getters and setters to set and retrieve data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Interface Methods
    public void run() {
        System.out.println(this.name + " runs");
    }

    public void attack() {
        System.out.println(this.name + " attacks");
    }

    public void heal() {
        System.out.println(this.name + " heals");
    }

    public void decreaseHealth() {
        System.out.println(this.name + " health decreased");
    }

    public void increaseStamina() {
        System.out.println(this.name + " stamina increased");
    }

    public void decreaseStamina() {
        System.out.println(this.name + " stamina decreased");
    }

    // custom method for
    protected void getInfo(){
        System.out.println("\n=== Character Info =======");
        System.out.println("Player: " + this.getName());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Stamina: " + this.getStamina());
        System.out.println("Speed: " + this.getSpeed());
        System.out.println("Attack Power: " + this.getAttackPower());
    }

}
