package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13265 {
    private final Productionnull_13265 production = new Productionnull_13265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}