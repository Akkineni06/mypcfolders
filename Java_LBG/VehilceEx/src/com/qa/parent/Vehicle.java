package com.qa.parent;

public class Vehicle {

    private String make;
    private String color;

    //default constructor

    public Vehicle(){}

    //everything constructor

    public Vehicle(String make, String color) {
        this.make = make;
        this.color = color;
    }

    //getters and setters


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Color: " + color;
    }
}
