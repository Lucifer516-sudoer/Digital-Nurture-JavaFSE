package com.dn5.junitbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calc = new Calculator(); // Arrange (here I made it as a `fixture`)

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3)); // Act & Assert
        /// AAA in action
    }

    @Test
    void testSubtract() {
        assertEquals(-1, calc.subtract(2, 3));

    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));

    }

    @Test
    void testDivide() {
        assertEquals(0, calc.divide(2, 3));
        assertThrows(
                ArithmeticException.class,
                () -> calc.divide(10, 0));

    }

}
