package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_482 {
    private final Production58_482 production = new Production58_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}