package org.gradle.test.performancenull_494;

import static org.junit.Assert.*;

public class Testnull_49368 {
    private final Productionnull_49368 production = new Productionnull_49368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}