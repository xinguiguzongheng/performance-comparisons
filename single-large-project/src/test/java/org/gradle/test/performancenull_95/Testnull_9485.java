package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9485 {
    private final Productionnull_9485 production = new Productionnull_9485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}