package com.abhishek.garagenearme;

/**
 * Created by abhishek on 15/4/18.
 */

public class AddNumbers {

    String cat,na,number;

    public AddNumbers() {
    }

    public AddNumbers(String cat, String na, String number) {
        this.cat = cat;
        this.na = na;
        this.number = number;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
