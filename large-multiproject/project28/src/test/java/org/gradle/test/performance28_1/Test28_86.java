package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_86 {
    private final Production28_86 production = new Production28_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}