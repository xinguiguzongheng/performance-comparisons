package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40025 {
    private final Productionnull_40025 production = new Productionnull_40025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}