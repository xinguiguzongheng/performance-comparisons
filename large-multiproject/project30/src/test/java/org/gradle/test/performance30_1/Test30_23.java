package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_23 {
    private final Production30_23 production = new Production30_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}