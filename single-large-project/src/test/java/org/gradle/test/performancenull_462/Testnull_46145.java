package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46145 {
    private final Productionnull_46145 production = new Productionnull_46145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}