package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_211 {
    private final Production25_211 production = new Production25_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}