package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_499 {
    private final Production28_499 production = new Production28_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}