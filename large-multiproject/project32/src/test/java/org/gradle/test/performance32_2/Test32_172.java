package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_172 {
    private final Production32_172 production = new Production32_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}