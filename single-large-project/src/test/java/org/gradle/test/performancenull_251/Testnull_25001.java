package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25001 {
    private final Productionnull_25001 production = new Productionnull_25001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}