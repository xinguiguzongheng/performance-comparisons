package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_265 {
    private final Production67_265 production = new Production67_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}