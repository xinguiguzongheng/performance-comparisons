package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_105 {
    private final Production40_105 production = new Production40_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}