package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_308 {
    private final Production88_308 production = new Production88_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}