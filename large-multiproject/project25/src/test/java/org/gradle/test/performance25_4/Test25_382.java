package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_382 {
    private final Production25_382 production = new Production25_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}