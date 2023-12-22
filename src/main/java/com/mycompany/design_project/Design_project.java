/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shahd
 */

   
public class Design_project {
//public class Client {

    public static void main(String[] args) {
        // Create instances using the creators
        ElectronicStoreFactory samsungStore = new SamsungCreator();

        // Create mobile instance and save to the database
        Mobile samsungMobile = samsungStore.createMobile("Samsung", "Galaxy S21", 128, "Android", 6.2, 4000);
        saveMobileToDatabase(samsungMobile);

        // Fetch mobile data from the database
        Mobile fetchedSamsungMobile = fetchMobileFromDatabase("Samsung", "Galaxy S21");

        // Display information
        if (fetchedSamsungMobile != null) {
            System.out.println(fetchedSamsungMobile.displayInfo());
        } else {
            System.out.println("Mobile not found in the database.");
        }

        // Create TV instance and save to the database
        TV samsungTV = samsungStore.createTV("Samsung", "QLED", 55.0, "4K UHD");
        saveTVToDatabase(samsungTV);

        // Fetch TV data from the database
        TV fetchedSamsungTV = fetchTVFromDatabase("Samsung", "QLED");

        // Display information
        if (fetchedSamsungTV != null) {
            System.out.println(fetchedSamsungTV.displayInfo());
        } else {
            System.out.println("TV not found in the database.");
        }

        // Create Laptop instance and save to the database
        Laptop samsungLaptop = samsungStore.createLaptop("Samsung", "Galaxy Book Pro", "Intel i7", 16, 512, 1.8);
        saveLaptopToDatabase(samsungLaptop);

        // Fetch Laptop data from the database
        Laptop fetchedSamsungLaptop = fetchLaptopFromDatabase("Samsung", "Galaxy Book Pro");

        // Display information
        if (fetchedSamsungLaptop != null) {
            System.out.println(fetchedSamsungLaptop.displayInfo());
        } else {
            System.out.println("Laptop not found in the database.");
        }
    }

    private static void saveMobileToDatabase(Mobile mobile) {
         String jdbcUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String username = "root";
        String password = "......";
        
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "INSERT INTO Mobiles (brand, model, storageCapacityGB, operatingSystem, screenSize, batteryCapacity) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, mobile.getBrand());
                statement.setString(2, mobile.getModel());
                statement.setInt(3, mobile.getStorageCapacityGB());
                statement.setString(4, mobile.getOperatingSystem());
                statement.setDouble(5, mobile.getScreenSize());
                statement.setInt(6, mobile.getBatteryCapacity());

                statement.executeUpdate();
                System.out.println("Mobile data saved to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Mobile fetchMobileFromDatabase(String brand, String model) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String username = "root";
        String password = ".......";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM Mobiles WHERE brand = ? AND model = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, brand);
                statement.setString(2, model);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return new SamsungMobile(
                                resultSet.getString("brand"),
                                resultSet.getString("model"),
                                resultSet.getInt("storageCapacityGB"),
                                resultSet.getString("operatingSystem"),
                                resultSet.getDouble("screenSize"),
                                resultSet.getInt("batteryCapacity")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Return null if not found
    }

    private static void saveTVToDatabase(TV tv) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String username = "root";
        String password = ".....";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "INSERT INTO TVs (brand, model, screenSize, resolution) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, tv.getBrand());
                statement.setString(2, tv.getModel());
                statement.setDouble(3, tv.getScreenSize());
                statement.setString(4, tv.getResolution());

                statement.executeUpdate();
                System.out.println("TV data saved to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static TV fetchTVFromDatabase(String brand, String model) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String username = "root";
        String password = ".....";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM TVs WHERE brand = ? AND model = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, brand);
                statement.setString(2, model);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return new SamsungTV(
                                resultSet.getString("brand"),
                                resultSet.getString("model"),
                                resultSet.getDouble("screenSize"),
                                resultSet.getString("resolution")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Return null if not found
    }

    private static void saveLaptopToDatabase(Laptop laptop) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String username = "root";
        String password = ".....";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "INSERT INTO Laptops (brand, model, processor, ramSize, storageCapacity, weight) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, laptop.getBrand());
                statement.setString(2, laptop.getModel());
                statement.setString(3, laptop.getProcessor());
                statement.setInt(4, laptop.getRAMSize());
                statement.setInt(5, laptop.getStorageCapacity());
                statement.setDouble(6, laptop.getWeight());

                statement.executeUpdate();
                System.out.println("Laptop data saved to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Laptop fetchLaptopFromDatabase(String brand, String model) {
         String jdbcUrl = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String username = "root";
        String password = ".....";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM Laptops WHERE brand = ? AND model = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, brand);
                statement.setString(2, model);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return new SamsungLaptop(
                                resultSet.getString("brand"),
                                resultSet.getString("model"),
                                resultSet.getString("processor"),
                                resultSet.getInt("ramSize"),
                                resultSet.getInt("storageCapacity"),
                                resultSet.getDouble("weight")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Return null if not found
    }
}

