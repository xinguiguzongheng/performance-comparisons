package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43067 {
    private final Productionnull_43067 production = new Productionnull_43067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}