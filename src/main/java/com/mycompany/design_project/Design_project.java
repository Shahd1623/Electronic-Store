/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
public class Design_project {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    // Create instances using the creators
        ElectronicStoreFactory samsungStore = new SamsungCreator();
        Mobile samsungMobile = samsungStore.createMobile("Samsung", "Galaxy S21", 128, "Android", 6.2, 4000);
        TV samsungTV = samsungStore.createTV("Samsung", "QLED", 55.0, "4K UHD");
        Laptop samsungLaptop = samsungStore.createLaptop("Samsung", "Galaxy Book Pro", "Intel i7", 16, 512, 1.8);

        // Display information
        System.out.println(samsungMobile.displayInfo());
        System.out.println(samsungTV.displayInfo());
        System.out.println(samsungLaptop.displayInfo());}
}
