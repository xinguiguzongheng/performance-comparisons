package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21060 {
    private final Productionnull_21060 production = new Productionnull_21060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}