package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23041 {
    private final Productionnull_23041 production = new Productionnull_23041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}