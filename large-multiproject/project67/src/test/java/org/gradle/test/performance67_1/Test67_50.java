package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_50 {
    private final Production67_50 production = new Production67_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}