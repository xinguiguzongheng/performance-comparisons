package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_34 {
    private final Production92_34 production = new Production92_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}