package com.pluralsight.dealership.models;

public class Dealership {
    private int id;
    private String dealershipName;
    private String address;
    private String phone;

    public Dealership() {
    }

    public Dealership(int id, String dealershipName, String address, String phone) {
        this.id = id;
        this.dealershipName = dealershipName;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
