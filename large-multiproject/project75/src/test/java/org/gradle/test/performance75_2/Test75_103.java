package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_103 {
    private final Production75_103 production = new Production75_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}