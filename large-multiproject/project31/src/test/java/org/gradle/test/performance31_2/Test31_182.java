package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_182 {
    private final Production31_182 production = new Production31_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}