package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_194 {
    private final Production59_194 production = new Production59_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}