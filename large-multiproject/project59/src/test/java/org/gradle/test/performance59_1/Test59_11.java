package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_11 {
    private final Production59_11 production = new Production59_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}