package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_376 {
    private final Production86_376 production = new Production86_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}