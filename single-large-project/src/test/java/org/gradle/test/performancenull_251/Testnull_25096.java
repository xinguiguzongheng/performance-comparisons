package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25096 {
    private final Productionnull_25096 production = new Productionnull_25096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}