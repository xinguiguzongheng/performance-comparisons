package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_305 {
    private final Production47_305 production = new Production47_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}