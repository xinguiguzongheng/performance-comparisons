package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4925 {
    private final Productionnull_4925 production = new Productionnull_4925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}