package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_122 {
    private final Production14_122 production = new Production14_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}