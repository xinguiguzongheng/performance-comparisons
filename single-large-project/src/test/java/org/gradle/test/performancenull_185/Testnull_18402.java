package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18402 {
    private final Productionnull_18402 production = new Productionnull_18402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}