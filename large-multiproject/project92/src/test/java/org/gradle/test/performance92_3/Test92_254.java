package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_254 {
    private final Production92_254 production = new Production92_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}