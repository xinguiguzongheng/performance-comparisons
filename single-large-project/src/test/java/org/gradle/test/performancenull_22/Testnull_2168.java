package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2168 {
    private final Productionnull_2168 production = new Productionnull_2168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}