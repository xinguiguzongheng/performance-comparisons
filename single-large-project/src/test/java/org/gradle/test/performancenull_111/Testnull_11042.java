package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11042 {
    private final Productionnull_11042 production = new Productionnull_11042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}