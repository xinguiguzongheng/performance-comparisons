package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_279 {
    private final Production80_279 production = new Production80_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}