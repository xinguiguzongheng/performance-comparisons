package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_219 {
    private final Production35_219 production = new Production35_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}