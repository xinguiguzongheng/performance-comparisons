package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_277 {
    private final Production27_277 production = new Production27_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}