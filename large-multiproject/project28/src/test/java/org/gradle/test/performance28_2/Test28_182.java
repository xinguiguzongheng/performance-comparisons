package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_182 {
    private final Production28_182 production = new Production28_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}