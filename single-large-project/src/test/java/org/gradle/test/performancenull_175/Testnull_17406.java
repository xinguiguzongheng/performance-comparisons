package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17406 {
    private final Productionnull_17406 production = new Productionnull_17406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}