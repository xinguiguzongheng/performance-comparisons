package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2380 {
    private final Productionnull_2380 production = new Productionnull_2380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}