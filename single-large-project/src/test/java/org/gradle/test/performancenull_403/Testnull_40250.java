package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40250 {
    private final Productionnull_40250 production = new Productionnull_40250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}