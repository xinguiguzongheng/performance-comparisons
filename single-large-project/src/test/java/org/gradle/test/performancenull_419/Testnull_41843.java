package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41843 {
    private final Productionnull_41843 production = new Productionnull_41843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}