package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12207 {
    private final Productionnull_12207 production = new Productionnull_12207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}