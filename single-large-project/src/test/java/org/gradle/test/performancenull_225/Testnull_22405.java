package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22405 {
    private final Productionnull_22405 production = new Productionnull_22405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}