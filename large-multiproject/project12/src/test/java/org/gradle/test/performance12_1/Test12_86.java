package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_86 {
    private final Production12_86 production = new Production12_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}