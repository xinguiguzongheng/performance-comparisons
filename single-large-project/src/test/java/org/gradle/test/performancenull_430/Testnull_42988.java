package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42988 {
    private final Productionnull_42988 production = new Productionnull_42988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}