package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34958 {
    private final Productionnull_34958 production = new Productionnull_34958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}