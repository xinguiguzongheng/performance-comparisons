package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21868 {
    private final Productionnull_21868 production = new Productionnull_21868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}