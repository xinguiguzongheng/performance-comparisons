package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6340 {
    private final Productionnull_6340 production = new Productionnull_6340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}