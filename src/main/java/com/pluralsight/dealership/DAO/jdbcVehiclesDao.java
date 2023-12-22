package com.pluralsight.dealership.DAO;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcVehiclesDao {
    private static BasicDataSource dataSource;
    private double minPrice;
    private double maxPrice;
    private int minMile;
    private int maxMile;
    public double getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }
    public double getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    public static BasicDataSource getDataSource() {
        return dataSource;
    }

    public static void setDataSource(BasicDataSource dataSource) {
        jdbcVehiclesDao.dataSource = dataSource;
    }

    public int getMinMile() {
        return minMile;
    }

    public void setMinMile(int minMile) {
        this.minMile = minMile;
    }

    public int getMaxMile() {
        return maxMile;
    }

    public void setMaxMile(int maxMile) {
        this.maxMile = maxMile;
    }
    public jdbcVehiclesDao(DataSource dataSource) {
    }
    public static void getAllVehicles() {
        String query = "SELECT * FROM vehicles;";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while(resultSet.next()) {
                System.out.println("VIN:       " + resultSet.getInt("VIN"));
                System.out.println("ID:        " + resultSet.getInt("dealership_id"));
                System.out.println("Price:     " + resultSet.getDouble("price"));
                System.out.println("Make:      " + resultSet.getString("make"));
                System.out.println("Model:     " + resultSet.getString("model"));
                System.out.println("Color:     " + resultSet.getString("color"));
                System.out.println("Sold:      " + resultSet.getBoolean("sold"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
