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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataAcess {
    Connection con;

    ArrayList<SonyMobile> SelectAll() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "R2301@rtrt#");
             PreparedStatement stmt = con.prepareStatement("select * from SonyMobile");
             ResultSet rs = stmt.executeQuery()) {

            ArrayList<SonyMobile> sonymobList = new ArrayList<>();
            while (rs.next()) {
                sonymobList.add(new SonyMobile(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                        rs.getDouble(5), rs.getInt(6)));
            }
            return sonymobList;

        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }

    SonyMobile Selectbymodel(String model) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "R2301@rtrt#");
             PreparedStatement stmt = con.prepareStatement("select * from SonyMobile where model=?")) {

            stmt.setString(1, model);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new SonyMobile(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                        rs.getDouble(5), rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

   int insertSonyMobile(SonyMobile sonyM) {
        int m = -1;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "R2301@rtrt#");
             PreparedStatement stmt = con.prepareStatement("insert into SonyMobile (brand, model, storagecapacity, " +"operatingsystem, screensize, batterycapacity) values (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, sonyM.getBrand());
            stmt.setString(2, sonyM.getModel());
            stmt.setInt(3, sonyM.getStorageCapacityGB());
            stmt.setString(4, sonyM.getOperatingSystem());
            stmt.setDouble(5, sonyM.getScreenSize());
            stmt.setInt(6, sonyM.getBatteryCapacity());

            m = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return m;
    }
  int deleteSonyMobilebymodel(String model) {
    int m = -1;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "R2301@rtrt#");
         PreparedStatement stmt = con.prepareStatement("DELETE FROM SonyMobile WHERE model= ?")) {

        stmt.setString(1, model);

        m = stmt.executeUpdate();
    } catch (Exception e) {
        System.out.println(e);
    }

    return m;
}
   
}