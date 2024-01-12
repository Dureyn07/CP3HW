package edu.estu;

import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.assertTimeoutPreemptively;

public class FailingTest {

    @Test
    public void testInfiniteLoop() {
        // This test should fail because infiniteLoop enters an infinite loop
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            App.infiniteLoop(0.0); // You can provide any input that triggers the infinite loop
        });
    }
}