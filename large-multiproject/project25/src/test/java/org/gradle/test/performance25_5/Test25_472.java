package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_472 {
    private final Production25_472 production = new Production25_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}