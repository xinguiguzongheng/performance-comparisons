package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9473 {
    private final Productionnull_9473 production = new Productionnull_9473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}