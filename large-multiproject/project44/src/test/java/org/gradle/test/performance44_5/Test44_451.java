package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_451 {
    private final Production44_451 production = new Production44_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}