package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17927 {
    private final Productionnull_17927 production = new Productionnull_17927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}