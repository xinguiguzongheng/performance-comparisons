package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_176 {
    private final Production55_176 production = new Production55_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}