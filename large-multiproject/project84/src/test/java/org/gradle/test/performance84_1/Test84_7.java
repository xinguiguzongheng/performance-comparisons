package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_7 {
    private final Production84_7 production = new Production84_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}