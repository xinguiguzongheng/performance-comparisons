package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34278 {
    private final Productionnull_34278 production = new Productionnull_34278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}