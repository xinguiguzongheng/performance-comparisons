package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_318 {
    private final Production48_318 production = new Production48_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}