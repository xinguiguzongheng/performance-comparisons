package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23681 {
    private final Productionnull_23681 production = new Productionnull_23681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}