package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_84 {
    private final Production88_84 production = new Production88_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}