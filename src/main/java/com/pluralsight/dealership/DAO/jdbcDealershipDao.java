package com.pluralsight.dealership.DAO;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcDealershipDao {
    private static BasicDataSource dataSource;
    public jdbcDealershipDao(BasicDataSource dataSource) {
        this.dataSource = dataSource;

    }
    public static void getAllDealership() {
        String query = "SELECT * FROM dealerships;";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while(resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("dealership_id"));
                System.out.println("Dealership Name: " + resultSet.getString("name"));
                System.out.println("Address: " + resultSet.getString("Address"));
                System.out.println("Phone " + resultSet.getString("Phone"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
