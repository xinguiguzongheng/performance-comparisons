package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7161 {
    private final Productionnull_7161 production = new Productionnull_7161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}