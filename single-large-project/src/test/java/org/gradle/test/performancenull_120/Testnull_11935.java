package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11935 {
    private final Productionnull_11935 production = new Productionnull_11935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}