package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_232 {
    private final Production75_232 production = new Production75_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}