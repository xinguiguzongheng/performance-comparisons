package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_354 {
    private final Production58_354 production = new Production58_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}