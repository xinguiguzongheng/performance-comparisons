package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_39 {
    private final Production55_39 production = new Production55_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}