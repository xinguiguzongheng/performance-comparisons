package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28473 {
    private final Productionnull_28473 production = new Productionnull_28473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}