package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_320 {
    private final Production47_320 production = new Production47_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}