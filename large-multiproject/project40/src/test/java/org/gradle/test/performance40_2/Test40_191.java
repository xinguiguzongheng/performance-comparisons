package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_191 {
    private final Production40_191 production = new Production40_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}