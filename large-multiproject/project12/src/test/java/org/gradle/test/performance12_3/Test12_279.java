package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_279 {
    private final Production12_279 production = new Production12_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}