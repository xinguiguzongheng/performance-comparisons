package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_204 {
    private final Production48_204 production = new Production48_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}