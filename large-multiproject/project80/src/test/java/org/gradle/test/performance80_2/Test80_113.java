package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_113 {
    private final Production80_113 production = new Production80_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}