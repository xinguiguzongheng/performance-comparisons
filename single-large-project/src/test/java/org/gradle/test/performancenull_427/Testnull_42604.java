package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42604 {
    private final Productionnull_42604 production = new Productionnull_42604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}