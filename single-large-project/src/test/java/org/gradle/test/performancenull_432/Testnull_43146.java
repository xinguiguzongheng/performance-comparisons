package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43146 {
    private final Productionnull_43146 production = new Productionnull_43146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}