package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_467 {
    private final Production35_467 production = new Production35_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}