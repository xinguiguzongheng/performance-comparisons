package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_222 {
    private final Production41_222 production = new Production41_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}