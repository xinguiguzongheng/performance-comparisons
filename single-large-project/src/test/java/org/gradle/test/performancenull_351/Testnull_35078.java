package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35078 {
    private final Productionnull_35078 production = new Productionnull_35078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}