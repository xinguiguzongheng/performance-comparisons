package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4473 {
    private final Productionnull_4473 production = new Productionnull_4473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}