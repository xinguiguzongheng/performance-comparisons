package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_42 {
    private final Production48_42 production = new Production48_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}