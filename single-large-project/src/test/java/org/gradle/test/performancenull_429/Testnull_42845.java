package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42845 {
    private final Productionnull_42845 production = new Productionnull_42845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}