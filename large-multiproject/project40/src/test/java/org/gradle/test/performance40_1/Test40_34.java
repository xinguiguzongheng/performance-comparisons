package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_34 {
    private final Production40_34 production = new Production40_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}