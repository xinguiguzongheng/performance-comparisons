package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_226 {
    private final Production12_226 production = new Production12_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}