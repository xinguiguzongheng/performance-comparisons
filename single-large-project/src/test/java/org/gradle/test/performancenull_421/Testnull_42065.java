package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42065 {
    private final Productionnull_42065 production = new Productionnull_42065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}