package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_180 {
    private final Production67_180 production = new Production67_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}