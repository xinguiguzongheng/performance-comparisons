package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_117 {
    private final Production29_117 production = new Production29_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}