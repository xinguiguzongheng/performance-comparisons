package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_403 {
    private final Production89_403 production = new Production89_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}