///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//
//package com.mycompany.design_project;
//
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_project;

import java.util.ArrayList;

public class Design_project {
    public static void main(String[] args) {
        // Example of creating objects using the factory pattern
        ElectronicStoreFactory samsungFactory = new SamsungCreator();
        Mobile samsungMobile = samsungFactory.createMobile("Samsung", "Galaxy S21", 128, "Android", 6.2, 4000);
        TV samsungTV = samsungFactory.createTV("Samsung", "Smart TV", 55.0, "4K");
        Laptop samsungLaptop = samsungFactory.createLaptop("Samsung", "Notebook 9", "Intel i7", 16, 512, 2.5);

        ElectronicStoreFactory sonyFactory = new SonyCreator();
        Mobile sonyMobile = sonyFactory.createMobile("Sony", "Xperia 1", 256, "Android", 6.5, 3500);
        TV sonyTV = sonyFactory.createTV("Sony", "Bravia", 65.0, "8K");
        Laptop sonyLaptop = sonyFactory.createLaptop("Sony", "VAIO", "Intel i5", 8, 256, 2.0);

        ElectronicStoreFactory appleFactory = new AppleCreator();
        Mobile appleMobile = appleFactory.createMobile("Apple", "iPhone 13", 256, "iOS", 6.1, 3110);
        TV appleTV = appleFactory.createTV("Apple", "Apple TV 4K", 50.0, "4K");
        Laptop appleLaptop = appleFactory.createLaptop("Apple", "MacBook Pro", "M1 Pro", 16, 512, 1.9);

        // Displaying information about the created objects
        displayInfo(samsungMobile);
        displayInfo(samsungTV);
        displayInfo(samsungLaptop);

        displayInfo(sonyMobile);
        displayInfo(sonyTV);
        displayInfo(sonyLaptop);

        displayInfo(appleMobile);
        displayInfo(appleTV);
        displayInfo(appleLaptop);

        // Example of using DataAccess class
        DataAcess dataAccess = new DataAcess();

        // Example of selecting all SonyMobile objects from the database
        ArrayList<SonyMobile> sonyMobileList = dataAccess.SelectAll();
        System.out.println("\nAll Sony Mobiles:");
        for (SonyMobile sony : sonyMobileList) {
            displayInfo(sony);
        }

        // Example of selecting a SonyMobile object by model from the database
        String modelToSearch = "Xperia 1";
        SonyMobile foundSonyMobile = dataAccess.Selectbymodel(modelToSearch);
        if (foundSonyMobile != null) {
            System.out.println("\nFound Sony Mobile by Model '" + modelToSearch + "':");
            displayInfo(foundSonyMobile);
        } else {
            System.out.println("\nSony Mobile by Model '" + modelToSearch + "' not found.");
        }

        // Example of inserting a new SonyMobile object into the database
        SonyMobile newSonyMobile = new SonyMobile("Sony", "New Model", 128, "Android", 6.0, 3000);
        int insertResult = dataAccess.insertSonyMobile(newSonyMobile);
        if (insertResult > 0) {
            System.out.println("\nNew Sony Mobile inserted successfully.");
        } else {
            System.out.println("\nFailed to insert new Sony Mobile.");
        }

        // Example of deleting a SonyMobile object by model from the database
        String modelToDelete = "New Model";
        int deleteResult = dataAccess.deleteSonyMobilebymodel(modelToDelete);
        if (deleteResult > 0) {
            System.out.println("\nSony Mobile with Model '" + modelToDelete + "' deleted successfully.");
        } else {
            System.out.println("\nFailed to delete Sony Mobile with Model '" + modelToDelete + "'.");
        }
    }

    private static void displayInfo(Mobile mobile) {
        System.out.println("\n" + mobile.displayInfo());
    }

    private static void displayInfo(TV tv) {
        System.out.println("\n" + tv.displayInfo());
    }

    private static void displayInfo(Laptop laptop) {
        System.out.println("\n" + laptop.displayInfo());
    }
}