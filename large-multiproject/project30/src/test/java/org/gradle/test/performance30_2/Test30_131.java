package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_131 {
    private final Production30_131 production = new Production30_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}