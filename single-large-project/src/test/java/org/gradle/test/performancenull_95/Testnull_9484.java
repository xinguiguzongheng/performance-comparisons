package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9484 {
    private final Productionnull_9484 production = new Productionnull_9484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}