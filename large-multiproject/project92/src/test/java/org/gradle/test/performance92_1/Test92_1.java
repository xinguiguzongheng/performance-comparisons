package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_1 {
    private final Production92_1 production = new Production92_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}