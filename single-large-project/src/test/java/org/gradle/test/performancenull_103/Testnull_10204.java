package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10204 {
    private final Productionnull_10204 production = new Productionnull_10204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}