package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_32 {
    private final Production24_32 production = new Production24_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}