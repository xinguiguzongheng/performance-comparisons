package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21745 {
    private final Productionnull_21745 production = new Productionnull_21745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}