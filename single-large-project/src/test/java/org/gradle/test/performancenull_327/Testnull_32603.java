package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32603 {
    private final Productionnull_32603 production = new Productionnull_32603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}