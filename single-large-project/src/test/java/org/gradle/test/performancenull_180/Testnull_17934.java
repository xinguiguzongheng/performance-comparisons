package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17934 {
    private final Productionnull_17934 production = new Productionnull_17934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}