package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21384 {
    private final Productionnull_21384 production = new Productionnull_21384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}