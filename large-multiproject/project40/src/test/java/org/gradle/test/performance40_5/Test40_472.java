package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_472 {
    private final Production40_472 production = new Production40_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}