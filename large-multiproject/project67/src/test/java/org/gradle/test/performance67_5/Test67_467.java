package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_467 {
    private final Production67_467 production = new Production67_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}