package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12943 {
    private final Productionnull_12943 production = new Productionnull_12943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}