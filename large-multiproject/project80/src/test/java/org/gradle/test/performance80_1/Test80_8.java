package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_8 {
    private final Production80_8 production = new Production80_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}