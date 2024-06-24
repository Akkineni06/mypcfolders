package com.qa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    @DisplayName("Add")
    public void addition() {
        int x = 5;
        int y = 6;
        int expected = 11;
        assertEquals(expected, calc.add(x, y));
    }
    @Test
    @DisplayName("Subtract")
    public void subtraction() {
        int x = 6;
        int y = 3;
        int expected = 3;
        assertEquals(expected, calc.subtract(x, y));
    }
    @Test
    @DisplayName("Mult")
    public void multiply() {
        int x = 6;
        int y = 2;
        int expected = 12;
        assertEquals(expected, calc.multi(x, y));
    }
    @Test
    @DisplayName("Divided")
    public void divided() {
        int x = 6;
        int y = 2;
        int expected = 3;
        assertEquals(expected, calc.div(x, y));
    }


}
