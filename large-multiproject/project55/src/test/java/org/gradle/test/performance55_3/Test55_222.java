package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_222 {
    private final Production55_222 production = new Production55_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}