/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_project;

/**
 *
 * @author shahd
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "....";

    public static void main(String[] args) {
        try {
            // Establish the connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create tables
            createMobileTable(connection);
            createTVTable(connection);
            createLaptopTable(connection);

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createMobileTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createMobileTableSQL = "CREATE TABLE Mobile (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "brand VARCHAR(255)," +
                    "model VARCHAR(255)," +
                    "storageCapacityGB INT," +
                    "operatingSystem VARCHAR(255)," +
                    "screenSize DOUBLE," +
                    "batteryCapacity INT)";
            statement.executeUpdate(createMobileTableSQL);
        }
    }

    private static void createTVTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTVTableSQL = "CREATE TABLE TV (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "brand VARCHAR(255)," +
                    "model VARCHAR(255)," +
                    "screenSize DOUBLE," +
                    "resolution VARCHAR(255))";
            statement.executeUpdate(createTVTableSQL);
        }
    }

    private static void createLaptopTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createLaptopTableSQL = "CREATE TABLE Laptop (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "brand VARCHAR(255)," +
                    "model VARCHAR(255)," +
                    "processor VARCHAR(255)," +
                    "ramSize INT," +
                    "storageCapacity INT," +
                    "weight DOUBLE)";
            statement.executeUpdate(createLaptopTableSQL);
        }
    }
}
