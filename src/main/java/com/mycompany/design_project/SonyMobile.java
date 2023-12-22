/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
public class SonyMobile implements Mobile {
    private String brand;
    private String model;
    private int storageCapacityGB;
    private String operatingSystem;
    private double screenSize;
    private int batteryCapacity;

    // Constructor for SonyMobile
    public SonyMobile(String brand, String model,int storageCapacityGB, String operatingSystem, double screenSize,int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacityGB = storageCapacityGB;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    public String displayInfo() {
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nStorage Capacity: " + storageCapacityGB + "GB" +
                "\nOperating System: " + operatingSystem +
                "\nScreen Size: " + screenSize + " inches" +
                "\nBattery Capacity: " + batteryCapacity + " mAh";
    }

     @Override
    public String getBrand() {
        return brand;
    }

     @Override
    public String getModel() {
        return model;
    }

     @Override
    public int getStorageCapacityGB() {
        return storageCapacityGB;
    }

     @Override
    public String getOperatingSystem() {
        return operatingSystem;
    }

     @Override
    public double getScreenSize() {
        return screenSize;
    }

     @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
