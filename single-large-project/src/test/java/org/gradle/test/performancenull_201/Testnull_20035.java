package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20035 {
    private final Productionnull_20035 production = new Productionnull_20035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}