package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_499 {
    private final Production80_499 production = new Production80_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}