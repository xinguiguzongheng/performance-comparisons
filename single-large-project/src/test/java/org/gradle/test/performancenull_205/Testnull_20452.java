package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20452 {
    private final Productionnull_20452 production = new Productionnull_20452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}