package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42085 {
    private final Productionnull_42085 production = new Productionnull_42085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}