package com.company;

public class Laptop {
    private String manuufacturer;
    private String model;
    private String serialNo;
    private float price;

    public Laptop(String manuufacturer, String model, String serialNo, float price) {
        this.manuufacturer = manuufacturer;
        this.model = model;
        this.serialNo = serialNo;
        this.price = price;
    }

    private Processor processor;
    private  Memory memory;
    private OpticalDrive opticalDrive;


    public String getManuufacturer() {
        return manuufacturer;
    }

    public void setManuufacturer(String manuufacturer) {
        this.manuufacturer = manuufacturer;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public OpticalDrive getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(OpticalDrive opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
