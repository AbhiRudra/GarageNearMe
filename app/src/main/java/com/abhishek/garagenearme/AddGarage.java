package com.abhishek.garagenearme;

/**
 * Created by abhishek on 7/4/18.
 */

public class AddGarage {
    String city,service,g_name,o_name,address,phone,additional,category;

    public AddGarage() {
    }

    public AddGarage(String city, String service, String g_name, String o_name, String address, String phone, String additional,String category) {
        this.city = city;
        this.service = service;
        this.g_name = g_name;
        this.o_name = o_name;
        this.address = address;
        this.phone = phone;
        this.additional=additional;
        this.category=category;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
