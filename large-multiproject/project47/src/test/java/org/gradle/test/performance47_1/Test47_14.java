package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_14 {
    private final Production47_14 production = new Production47_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}