package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25442 {
    private final Productionnull_25442 production = new Productionnull_25442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}