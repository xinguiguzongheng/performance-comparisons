package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_132 {
    private final Production40_132 production = new Production40_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}