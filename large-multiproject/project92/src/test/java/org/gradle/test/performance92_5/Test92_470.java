package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_470 {
    private final Production92_470 production = new Production92_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}