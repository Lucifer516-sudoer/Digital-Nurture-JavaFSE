package com.dn5.junitbasics;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TaskPerformerTest {
    private final TaskPerformer performer = new TaskPerformer();

    @Test
    @Order(10)
    void testIfSleepsForTwoSeconds() {
        assertTimeout(Duration.ofSeconds(3), () -> performer.performTask(2));
    }

    @ParameterizedTest
    @Order(20)
    @ValueSource(ints = { 2, 4, 5, 6 })
    void testMultipleTimeouts(int timeoutInSeconds) {
        assertTimeout(Duration.ofSeconds(timeoutInSeconds + 1), () -> performer.performTask(timeoutInSeconds));
    }
}
