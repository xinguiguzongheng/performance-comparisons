package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_197 {
    private final Production40_197 production = new Production40_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}