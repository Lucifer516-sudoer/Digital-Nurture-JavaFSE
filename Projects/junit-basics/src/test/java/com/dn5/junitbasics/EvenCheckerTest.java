package com.dn5.junitbasics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    @ParameterizedTest
    @CsvFileSource(resources = "/even_numbers_test_sample.csv", numLinesToSkip = 1)
    void shouldCheckEvensFromCSV(int number, boolean expected) {
        assertEquals(expected, checker.isEven(number));

    }

    // Now to the method source ...
    static Stream<Integer> evenNumbers() {
        // Note: written by chat this one
        return IntStream
                .rangeClosed(1, 1_000)
                .filter(n -> n % 2 == 0)
                .boxed();
    }

    @ParameterizedTest
    @MethodSource("evenNumbers")
    void shouldCheckEvenNumbersFromMethodSource(int number) {
        assertTrue(checker.isEven(number));
    }

    @ParameterizedTest
    @NullSource
    void isNullTest(String smtg) { // NOTE: Name is purposefully left ambiguous
        assertNull(smtg);
    }

}
