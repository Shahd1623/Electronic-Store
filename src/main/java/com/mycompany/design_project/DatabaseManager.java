//    /*
//     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//     */
//    package com.mycompany.design_project;
//    
//
//    /**
//     *
//     * @author shahd
//     */

//    import java.sql.Connection;
//    import java.sql.DriverManager;
//    import java.sql.PreparedStatement;
//    import java.sql.SQLException;
//    import java.util.logging.Level;
//    import java.util.logging.Logger;
//
//public class DatabaseManager {
//             public static void main(String[] args) {
//        
//         Connection con;
//        PreparedStatement pst;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electonicstore", "root", ".....");
//            System.out.println("Success");
//                    
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Design_project.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Design_project.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    }
//    //-----------------------------------------------------------------------------------------------------
//        // JDBC URL, username, and password of MySQL server
////        private static String JDBC_URL = "jdbc:mysql://localhost:3306/electonicstore";
////        private static final String USERNAME = "root";
////        private static final String PASSWORD = "Sho!166sho";
////    
////        public static void main(String[] args) {
////            try {
////                // Establish the connection
////                Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
////    
////                // Create tables
//////                createMobileTable(connection);
//////                createTVTable(connection);
//////                createLaptopTable(connection);
////    
////                // Close the connection
////                connection.close();
////            } catch (SQLException e) {
////                // Handle specific SQL exceptions
////                e.printStackTrace();
////            } catch (Exception e) {
////                // Handle other exceptions
////                e.printStackTrace();
////            }
////        }
////    
////        private static void createMobileTable(Connection connection) throws SQLException {
////            try (Statement statement = connection.createStatement()) {
//////                String createMobileTableSQL = "CREATE TABLE Mobile (" +
//////                        "id INT AUTO_INCREMENT PRIMARY KEY," +
//////                        "brand VARCHAR(255)," +
//////                        "model VARCHAR(255)," +
//////                        "storageCapacityGB INT," +
//////                        "operatingSystem VARCHAR(255)," +
//////                        "screenSize DOUBLE," +
//////                        "batteryCapacity INT)";
////                statement.executeUpdate(createMobileTableSQL);
////            }
////        }
////    
////        private static void createTVTable(Connection connection) throws SQLException {
////            try (Statement statement = connection.createStatement()) {
//////                String createTVTableSQL = "CREATE TABLE TV (" +
//////                        "id INT AUTO_INCREMENT PRIMARY KEY," +
//////                        "brand VARCHAR(255)," +
//////                        "model VARCHAR(255)," +
//////                        "screenSize DOUBLE," +
//////                        "resolution VARCHAR(255))";
////                statement.executeUpdate(createTVTableSQL);
////            }
////        }
////    
//        private static void createLaptopTable(Connection connection) throws SQLException {
//            try (Statement statement = connection.createStatement()) {
//                String createLaptopTableSQL = "CREATE TABLE Laptop (" +
//                        "id INT AUTO_INCREMENT PRIMARY KEY," +
//                        "brand VARCHAR(255)," +
//                        "model VARCHAR(255)," +
//                        "processor VARCHAR(255)," +
//                        "ramSize INT," +
//                        "storageCapacity INT," +
//                        "weight DOUBLE)";
//                statement.executeUpdate(createLaptopTableSQL);
//
//        }
////    }
//try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electonicstore", "root", ".....");
//
//
