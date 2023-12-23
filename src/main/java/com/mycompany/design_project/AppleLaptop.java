/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */

public class AppleLaptop implements Laptop {
    private String brand;
    private String model;
    private String processor;
    private int ramSize;
    private int storageCapacity;
    private double weight;

    // Constructor
    public AppleLaptop(String brand,String model, String processor, int ramSize, int storageCapacity, double weight) {
        this.brand = "Samsung";
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.weight = weight;
    }

    // Implementing interface methods
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getProcessor() {
        return processor;
    }

    @Override
    public int getRAMSize() {
        return ramSize;
    }

    @Override
    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String displayInfo() {
        return "Brand: " + getBrand() +
               "\nModel: " + getModel() +
               "\nProcessor: " + getProcessor() +
               "\nRAM Size: " + getRAMSize() +
               " GB\nStorage Capacity: " + getStorageCapacity() +
               " GB\nWeight: " + getWeight() + " kg";
    }
}