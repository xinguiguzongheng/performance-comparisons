package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_20 {
    private final Production32_20 production = new Production32_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}