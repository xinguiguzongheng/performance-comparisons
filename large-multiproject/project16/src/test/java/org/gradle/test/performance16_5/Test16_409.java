package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_409 {
    private final Production16_409 production = new Production16_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}