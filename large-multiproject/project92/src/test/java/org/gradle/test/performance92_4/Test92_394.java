package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_394 {
    private final Production92_394 production = new Production92_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}