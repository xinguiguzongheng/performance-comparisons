package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_101 {
    private final Production37_101 production = new Production37_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}