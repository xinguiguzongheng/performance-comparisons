package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23872 {
    private final Productionnull_23872 production = new Productionnull_23872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}