package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46170 {
    private final Productionnull_46170 production = new Productionnull_46170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}