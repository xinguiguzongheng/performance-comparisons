package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24968 {
    private final Productionnull_24968 production = new Productionnull_24968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}