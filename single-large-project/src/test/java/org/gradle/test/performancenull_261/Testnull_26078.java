package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26078 {
    private final Productionnull_26078 production = new Productionnull_26078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}