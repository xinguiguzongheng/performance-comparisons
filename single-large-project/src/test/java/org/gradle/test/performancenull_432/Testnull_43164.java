package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43164 {
    private final Productionnull_43164 production = new Productionnull_43164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}