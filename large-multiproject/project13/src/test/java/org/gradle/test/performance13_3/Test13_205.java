package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_205 {
    private final Production13_205 production = new Production13_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}