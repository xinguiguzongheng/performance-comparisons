package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_328 {
    private final Production80_328 production = new Production80_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}