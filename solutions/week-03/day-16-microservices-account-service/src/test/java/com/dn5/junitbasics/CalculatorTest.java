package com.dn5.junitbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc; // Arrange (here I made it as a `fixture`)

    @BeforeEach // NOTE: THough, since this is just one Object creation, I would use BeforeAll,
                // if its
                // what it is ...
    void setup() {
        System.out.println("Creating the new Calculator ...");
        calc = new Calculator();

    }

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

    @AfterEach
    void tearDown() { // I prefer it to be clean up, rather than tear down, but hey chat is bit more
                      // of a book worm than me ...
        System.out.println("Clean up ...");
        calc = null;
    }
}
