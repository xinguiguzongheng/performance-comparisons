package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16093 {
    private final Productionnull_16093 production = new Productionnull_16093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}