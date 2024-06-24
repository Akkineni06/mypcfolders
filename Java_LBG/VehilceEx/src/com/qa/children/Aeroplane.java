package com.qa.children;

import com.qa.parent.Vehicle;

public class Aeroplane extends Vehicle {

    private String sizeOfWings;

    public Aeroplane(String sizeOfWings) {
        this.sizeOfWings = sizeOfWings;
    }

    public Aeroplane(String make, String color, String sizeOfWings) {
        super(make, color);
        this.sizeOfWings = sizeOfWings;
    }

    public String getSizeOfWings() {
        return sizeOfWings;
    }

    public void setSizeOfWings(String sizeOfWings) {
        this.sizeOfWings = sizeOfWings;
    }

    @Override
    public String toString() {
        return "Aeroplane: " + "Wing Size: " + sizeOfWings + " , " + super.toString();
    }
}
