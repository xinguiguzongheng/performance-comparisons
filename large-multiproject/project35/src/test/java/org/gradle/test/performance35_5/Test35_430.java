package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_430 {
    private final Production35_430 production = new Production35_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}