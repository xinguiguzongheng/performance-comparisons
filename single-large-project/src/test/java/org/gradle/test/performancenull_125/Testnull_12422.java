package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12422 {
    private final Productionnull_12422 production = new Productionnull_12422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}