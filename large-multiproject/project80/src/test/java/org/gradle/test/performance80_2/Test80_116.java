package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_116 {
    private final Production80_116 production = new Production80_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}