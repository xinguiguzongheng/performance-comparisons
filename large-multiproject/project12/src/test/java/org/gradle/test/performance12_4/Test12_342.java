package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_342 {
    private final Production12_342 production = new Production12_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}