package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_317 {
    private final Production28_317 production = new Production28_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}