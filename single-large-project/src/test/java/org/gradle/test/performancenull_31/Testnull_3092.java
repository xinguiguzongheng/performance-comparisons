package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3092 {
    private final Productionnull_3092 production = new Productionnull_3092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}