package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_206 {
    private final Production89_206 production = new Production89_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}