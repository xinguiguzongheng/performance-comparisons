package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_206 {
    private final Production25_206 production = new Production25_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}