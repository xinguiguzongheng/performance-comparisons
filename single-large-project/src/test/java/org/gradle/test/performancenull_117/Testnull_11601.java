package org.gradle.test.performancenull_117;

import static org.junit.Assert.*;

public class Testnull_11601 {
    private final Productionnull_11601 production = new Productionnull_11601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}