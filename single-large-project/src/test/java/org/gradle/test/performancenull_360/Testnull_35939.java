package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35939 {
    private final Productionnull_35939 production = new Productionnull_35939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}