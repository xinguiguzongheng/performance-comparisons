package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_161 {
    private final Production84_161 production = new Production84_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}