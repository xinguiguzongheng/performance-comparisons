package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12280 {
    private final Productionnull_12280 production = new Productionnull_12280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}