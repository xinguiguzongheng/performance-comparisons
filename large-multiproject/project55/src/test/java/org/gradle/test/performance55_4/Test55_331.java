package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_331 {
    private final Production55_331 production = new Production55_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}