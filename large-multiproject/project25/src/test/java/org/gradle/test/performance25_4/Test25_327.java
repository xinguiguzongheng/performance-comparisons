package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_327 {
    private final Production25_327 production = new Production25_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}