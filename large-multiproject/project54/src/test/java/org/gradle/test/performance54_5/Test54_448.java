package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_448 {
    private final Production54_448 production = new Production54_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}