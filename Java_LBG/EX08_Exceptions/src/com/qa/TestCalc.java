package com.qa;

import java.sql.SQLOutput;

public class TestCalc {

    public static void main(String[] args) {

        BadCalc bc = new BadCalc();

        System.out.println("Mult result:" + bc.mult(4, 3));
        try {
            System.out.println("Div result:" + bc.div(8, 0));
        } catch (ArithmeticException ae) {
            System.out.println("Calculation error caught");
//            System.out.println(ae);
//            ae.printStackTrace();


        }

    }
}
