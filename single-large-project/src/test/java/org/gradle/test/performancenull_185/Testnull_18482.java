package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18482 {
    private final Productionnull_18482 production = new Productionnull_18482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}