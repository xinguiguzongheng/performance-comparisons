package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21990 {
    private final Productionnull_21990 production = new Productionnull_21990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}