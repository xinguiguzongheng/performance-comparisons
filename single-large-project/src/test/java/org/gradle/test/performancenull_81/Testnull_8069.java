package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8069 {
    private final Productionnull_8069 production = new Productionnull_8069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}