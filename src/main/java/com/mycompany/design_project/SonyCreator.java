/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
public class SonyCreator extends ElectronicStoreFactory{
    @Override
    public Mobile createMobile(String brand, String model, int storageCapacityGB, String operatingSystem, double screenSize, int batteryCapacity) {
        return new SonyMobile(brand, model, storageCapacityGB, operatingSystem, screenSize, batteryCapacity);
    }

    @Override
    public TV createTV(String brand, String model, double screenSize, String resolution) {
        return new SonyTV(brand, model, screenSize, resolution);
    }

    @Override
    public Laptop createLaptop(String brand, String model, String processor, int ramSize, int storageCapacity, double weight) {
        return new SonyLaptop(brand, model, processor, ramSize, storageCapacity, weight);
    }
}
