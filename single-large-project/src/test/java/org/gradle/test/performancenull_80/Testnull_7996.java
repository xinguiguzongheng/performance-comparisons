package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7996 {
    private final Productionnull_7996 production = new Productionnull_7996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}