package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25862 {
    private final Productionnull_25862 production = new Productionnull_25862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}