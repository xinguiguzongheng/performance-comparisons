package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_344 {
    private final Production14_344 production = new Production14_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}