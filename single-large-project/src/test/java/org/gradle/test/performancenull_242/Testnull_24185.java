package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24185 {
    private final Productionnull_24185 production = new Productionnull_24185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}