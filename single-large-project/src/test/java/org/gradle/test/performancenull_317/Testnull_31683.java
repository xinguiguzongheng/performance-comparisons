package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31683 {
    private final Productionnull_31683 production = new Productionnull_31683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}