package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_98 {
    private final Production12_98 production = new Production12_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}