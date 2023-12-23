/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
public class SamsungMobile implements Mobile{
    private int id;
    private String brand;
    private String model;
    private int storageCapacityGB;
    private String operatingSystem;
    private double screenSize;
    private int batteryCapacity;

    // Constructor for SamsungMobile
    public SamsungMobile(String brand, String model, int storageCapacityGB, String operatingSystem, double screenSize, int batteryCapacity) {
        this.id=id;
        this.brand = brand;
        this.model = model;
        this.storageCapacityGB = storageCapacityGB;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String displayInfo() {
        return  "SamsungId: "+id+
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nStorage Capacity: " + storageCapacityGB + "GB" +
                "\nOperating System: " + operatingSystem +
                "\nScreen Size: " + screenSize + " inches" +
                "\nBattery Capacity: " + batteryCapacity + " mAh";
    }

    public int getid() {
        return id;
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

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}