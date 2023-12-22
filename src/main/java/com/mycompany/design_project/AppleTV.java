/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
public class AppleTV implements TV {
    private String brand;
    private String model;
    private double screenSize;
    private String resolution;

    // Constructor
    public AppleTV(String model, String resolution, double screenSize, String resolution1) {
        this.brand = "Samsung";
        this.model = model;
        this.screenSize = screenSize;
        this.resolution = resolution;
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
    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public String displayInfo() {
        return "Brand: " + getBrand() +
               "\nModel: " + getModel() +
               "\nScreen Size: " + getScreenSize() +
               " inches\nResolution: " + getResolution();
    }
}
