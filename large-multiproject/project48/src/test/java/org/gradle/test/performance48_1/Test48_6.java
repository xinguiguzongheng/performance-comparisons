package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_6 {
    private final Production48_6 production = new Production48_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}