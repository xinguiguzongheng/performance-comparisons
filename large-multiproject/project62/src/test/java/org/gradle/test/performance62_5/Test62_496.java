package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_496 {
    private final Production62_496 production = new Production62_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}