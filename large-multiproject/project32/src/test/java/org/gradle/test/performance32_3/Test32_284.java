package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_284 {
    private final Production32_284 production = new Production32_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}