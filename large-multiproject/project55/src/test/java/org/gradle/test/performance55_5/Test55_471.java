package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_471 {
    private final Production55_471 production = new Production55_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}