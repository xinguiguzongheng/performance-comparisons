package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26001 {
    private final Productionnull_26001 production = new Productionnull_26001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}