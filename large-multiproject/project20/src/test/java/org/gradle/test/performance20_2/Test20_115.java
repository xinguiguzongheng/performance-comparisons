package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_115 {
    private final Production20_115 production = new Production20_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}