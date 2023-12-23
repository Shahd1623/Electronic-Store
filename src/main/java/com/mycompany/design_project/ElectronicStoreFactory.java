/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
public abstract class ElectronicStoreFactory {
    public abstract Mobile createMobile(String brand, String model, int storageCapacityGB, String operatingSystem, double screenSize, int batteryCapacity);

    public abstract TV createTV(String brand, String model, double screenSize, String resolution);

    public abstract Laptop createLaptop(String brand, String model, String processor, int ramSize, int storageCapacity, double weight);
}