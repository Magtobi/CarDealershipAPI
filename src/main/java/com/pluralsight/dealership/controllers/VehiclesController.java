package com.pluralsight.dealership.controllers;

import com.pluralsight.dealership.DAO.jdbcVehiclesDao;
import com.pluralsight.dealership.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehiclesController {
    private jdbcVehiclesDao jdbcVehiclesDao;
    @Autowired
    public VehiclesController(jdbcVehiclesDao jdbcVehiclesDao) {
        this.jdbcVehiclesDao = jdbcVehiclesDao;
    }
    @RequestMapping(path = "/vehicles", method = RequestMethod.GET)
    public List<Vehicle> getAllVehicles() {
        void vehicles = jdbcVehiclesDao.getAllVehicles();
        return vehicles;
    }
}
