package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_251 {
    private final Production32_251 production = new Production32_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}