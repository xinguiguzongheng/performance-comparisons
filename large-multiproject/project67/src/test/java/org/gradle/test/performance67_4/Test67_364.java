package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_364 {
    private final Production67_364 production = new Production67_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}