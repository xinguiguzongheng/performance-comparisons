package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34069 {
    private final Productionnull_34069 production = new Productionnull_34069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}