package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_11 {
    private final Production63_11 production = new Production63_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}