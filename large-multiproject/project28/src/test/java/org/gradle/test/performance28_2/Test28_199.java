package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_199 {
    private final Production28_199 production = new Production28_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}