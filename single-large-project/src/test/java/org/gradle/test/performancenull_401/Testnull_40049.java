package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40049 {
    private final Productionnull_40049 production = new Productionnull_40049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}