package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_349 {
    private final Production10_349 production = new Production10_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}