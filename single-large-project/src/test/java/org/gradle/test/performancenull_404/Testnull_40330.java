package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40330 {
    private final Productionnull_40330 production = new Productionnull_40330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}