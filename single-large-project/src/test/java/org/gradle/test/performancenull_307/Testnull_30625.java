package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30625 {
    private final Productionnull_30625 production = new Productionnull_30625("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}