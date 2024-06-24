package com.qa.children;

import com.qa.parent.Vehicle;

public class Car extends Vehicle {

    private String bodyType;

    public Car(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String make, String color, String bodyType) {
        super(make, color);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car: " + "Body Type: " + bodyType + " , " + super.toString();
    }
}
