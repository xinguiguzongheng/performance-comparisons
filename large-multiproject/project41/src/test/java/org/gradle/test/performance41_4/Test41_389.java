package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_389 {
    private final Production41_389 production = new Production41_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}