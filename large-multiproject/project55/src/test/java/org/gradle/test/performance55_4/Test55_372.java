package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_372 {
    private final Production55_372 production = new Production55_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}