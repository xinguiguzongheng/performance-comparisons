package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30398 {
    private final Productionnull_30398 production = new Productionnull_30398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}