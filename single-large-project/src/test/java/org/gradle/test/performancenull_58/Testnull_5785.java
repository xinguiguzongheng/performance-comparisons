package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5785 {
    private final Productionnull_5785 production = new Productionnull_5785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}