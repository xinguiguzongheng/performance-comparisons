package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6385 {
    private final Productionnull_6385 production = new Productionnull_6385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}