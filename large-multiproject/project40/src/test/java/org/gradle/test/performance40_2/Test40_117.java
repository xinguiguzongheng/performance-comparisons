package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_117 {
    private final Production40_117 production = new Production40_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}