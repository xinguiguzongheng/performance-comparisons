package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35246 {
    private final Productionnull_35246 production = new Productionnull_35246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}