package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_373 {
    private final Production67_373 production = new Production67_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}