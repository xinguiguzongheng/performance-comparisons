package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_101 {
    private final Production84_101 production = new Production84_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}