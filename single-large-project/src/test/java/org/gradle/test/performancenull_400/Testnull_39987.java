package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39987 {
    private final Productionnull_39987 production = new Productionnull_39987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}