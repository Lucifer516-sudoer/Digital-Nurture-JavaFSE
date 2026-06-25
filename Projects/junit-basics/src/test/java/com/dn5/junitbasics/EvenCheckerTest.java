package com.dn5.junitbasics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {
    private final EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 8, 10 })
    void shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(checker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 5, 7, 9, 11 })
    void shouldNotReturnTrueForOddNumbers(int number) {
        assertFalse(checker.isEven(number));
    }

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "4, true",
            "6, true",
            "8, true",
            "10, true",
            "1, false",
            "3, false",
            "5, false",
            "7, false",
            "9, false",
    })
    void shouldCheckEvenNumbers(int number, boolean expected) {
        assertEquals(expected, checker.isEven(number));
    }
}
