package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_359 {
    private final Production59_359 production = new Production59_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}