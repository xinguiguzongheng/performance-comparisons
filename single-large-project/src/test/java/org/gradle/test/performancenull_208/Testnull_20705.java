package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20705 {
    private final Productionnull_20705 production = new Productionnull_20705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}