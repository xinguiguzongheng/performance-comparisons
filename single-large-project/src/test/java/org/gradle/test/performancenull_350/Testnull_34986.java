package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34986 {
    private final Productionnull_34986 production = new Productionnull_34986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}