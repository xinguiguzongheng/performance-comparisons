package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29961 {
    private final Productionnull_29961 production = new Productionnull_29961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}