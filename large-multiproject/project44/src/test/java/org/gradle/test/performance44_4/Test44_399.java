package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_399 {
    private final Production44_399 production = new Production44_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}