package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_219 {
    private final Production87_219 production = new Production87_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}