package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42272 {
    private final Productionnull_42272 production = new Productionnull_42272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}