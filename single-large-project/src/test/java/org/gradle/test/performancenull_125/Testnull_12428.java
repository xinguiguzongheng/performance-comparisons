package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12428 {
    private final Productionnull_12428 production = new Productionnull_12428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}