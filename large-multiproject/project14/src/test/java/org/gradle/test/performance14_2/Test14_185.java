package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_185 {
    private final Production14_185 production = new Production14_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}