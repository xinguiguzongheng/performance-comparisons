package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_394 {
    private final Production75_394 production = new Production75_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}