package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_133 {
    private final Production67_133 production = new Production67_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}