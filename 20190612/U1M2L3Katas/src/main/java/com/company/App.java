package com.company;

public class App {
    public TV createTV() {
        TV tv = new TV();
        tv.setManufacturer("Zenith");
        tv.setModel("U2121H");
        tv.setScreenSize(83);
        tv.setChannel("NBC");
        tv.setVolume(55);
        tv.setPowered(false);
        return tv;
    }

    public Radio createRadio() {
        Radio radio = new Radio();
        radio.setManufacturer("Sony");
        radio.setModel("V32");
        radio.setNumSpeakers(2);
        radio.setStation("WUNV");
        radio.setVolume(30);
        radio.setPowered(true);
        return radio;
    }

    public Microwave createMicrowave() {
        Microwave micro = new Microwave();
        micro.setManufacturer("Haier");
        micro.setModel("X1200w");
        micro.setSecondsLeft(45);
        micro.setTime("12:00");
        micro.setRunning(false);
        return micro;
    }

    public CoffeeMaker createCoffeeMaker() {
        CoffeeMaker joe = new CoffeeMaker();
        joe.setManufacturer("Sunbeam");
        joe.setModel("C12");
        joe.setCarafeSize(12);
        joe.setCupsLeft(8);
        joe.setPowered(true);
        return joe;
    }

    public Car createCar() {
        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Accord");
        car.setType("Sedan");
        car.setColor("Blue");
        car.setEngine("2.6L V6");
        car.setTransmission("CVT");
        car.setNumDoors(4);
        car.setMpg(31.7);
        car.setMilesDriven(25218);
        return car;
    }

    public ComputerMouse createComputerMouse() {
        ComputerMouse mouse = new ComputerMouse();
        mouse.setManufacturer("Razer");
        mouse.setModel("Naga");
        mouse.setxPosition(960);
        mouse.setyPosition(540);
        int[] arr = {0, 0};
        mouse.setLastClickedLocation(arr);
        return mouse;
    }

}
