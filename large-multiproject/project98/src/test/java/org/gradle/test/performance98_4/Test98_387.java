package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_387 {
    private final Production98_387 production = new Production98_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}