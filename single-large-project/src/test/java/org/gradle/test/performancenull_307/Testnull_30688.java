package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30688 {
    private final Productionnull_30688 production = new Productionnull_30688("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}