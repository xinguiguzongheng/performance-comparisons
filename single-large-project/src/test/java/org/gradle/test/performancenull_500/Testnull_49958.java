package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49958 {
    private final Productionnull_49958 production = new Productionnull_49958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}