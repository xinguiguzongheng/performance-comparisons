package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_493 {
    private final Production20_493 production = new Production20_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}