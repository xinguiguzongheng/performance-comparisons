package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_13 {
    private final Production25_13 production = new Production25_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}