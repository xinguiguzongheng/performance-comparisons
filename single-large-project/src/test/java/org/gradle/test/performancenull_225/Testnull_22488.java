package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22488 {
    private final Productionnull_22488 production = new Productionnull_22488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}