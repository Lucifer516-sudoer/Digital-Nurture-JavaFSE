package com.dn5.junitbasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionTest {
    @Test
    public void testAssertions() {
        // Note: Here this is arrange
        int age = 20;
        String name = null;
        Calculator calc = new Calculator();

        assertTrue(age >= 18);
        assertFalse(age <= 18);
        assertNull(name);
        assertNotNull(calc);

    }
}
