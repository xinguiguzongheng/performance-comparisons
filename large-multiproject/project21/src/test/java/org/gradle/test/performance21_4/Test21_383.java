package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_383 {
    private final Production21_383 production = new Production21_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}