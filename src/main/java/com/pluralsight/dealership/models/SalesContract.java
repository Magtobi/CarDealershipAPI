package com.pluralsight.dealership.models;

public class SalesContract {
    private int saleId;
    private int VIN;
    private int dealershipId;
    private String firstName;
    private String lastName;
    private String address;
    private String salesDate;

    public SalesContract(String firstName, String lastName, String address, String salesDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salesDate = salesDate;
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

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }
}
