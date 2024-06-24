package com.qa;

import com.qa.children.Aeroplane;
import com.qa.children.Car;

public class Main {

    public static void main(String[] args) {
        Aeroplane  air1 = new Aeroplane("Airbus", "Red", "Large");
        Aeroplane  air2 = new Aeroplane("Boeing","Blue", "Medium");
        Car car1 = new Car ("Mercedes", "White", "SUV");
        Car car2 = new Car ("Audi", "Silver", "Sedan");

//        air1.setMake("Embraer");
//        air1.setSizeOfWings("small");
        car1.setMake("BMW");


        System.out.println(air1);
        System.out.println(air2);
        System.out.println(car1);
        System.out.println(car2);

    }

}

