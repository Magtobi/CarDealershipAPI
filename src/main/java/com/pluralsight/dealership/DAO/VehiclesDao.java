package com.pluralsight.dealership.DAO;

import com.pluralsight.dealership.models.Vehicle;

import java.util.List;

public interface VehiclesDao {
    List<Vehicle> getAll();
    Vehicle getMinPrice(int id);
    Vehicle getMaxPrice(int id);
    Vehicle getMakeModel(int id);
    Vehicle getYear(int id);
    Vehicle getColor(int id);
    Vehicle geType(int id);
    Vehicle getMinMile(int id);
    Vehicle getMaxMile(int id);
    Vehicle insert(Vehicle vehicle);
    void update(int id, Vehicle vehicle);
    void delete(int id);
}
