package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8278 {
    private final Productionnull_8278 production = new Productionnull_8278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}