package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22498 {
    private final Productionnull_22498 production = new Productionnull_22498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}