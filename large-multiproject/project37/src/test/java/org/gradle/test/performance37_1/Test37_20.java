package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_20 {
    private final Production37_20 production = new Production37_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}