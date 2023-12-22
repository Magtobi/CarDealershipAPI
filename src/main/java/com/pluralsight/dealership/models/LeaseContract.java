package com.pluralsight.dealership.models;

public class LeaseContract {
    private int leaseId;
    private int VIN;
    private int dealershipId;
    private String firstName;
    private String lastName;
    private String address;
    private String startDate;
    private String endDate;
    private double amountPaid;
    private double amountDue;

    public LeaseContract(String firstName, String lastName, String address, String startDate, String endDate, double amountPaid, double amountDue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amountPaid = amountPaid;
        this.amountDue = amountDue;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}

