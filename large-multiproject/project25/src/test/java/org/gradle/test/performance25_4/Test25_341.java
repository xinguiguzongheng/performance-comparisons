package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_341 {
    private final Production25_341 production = new Production25_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}