package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_448 {
    private final Production16_448 production = new Production16_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}