package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_104 {
    private final Production12_104 production = new Production12_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}