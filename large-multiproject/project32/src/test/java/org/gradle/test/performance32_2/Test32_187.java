package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_187 {
    private final Production32_187 production = new Production32_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}