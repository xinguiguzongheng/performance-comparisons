package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23064 {
    private final Productionnull_23064 production = new Productionnull_23064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}