package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_429 {
    private final Production24_429 production = new Production24_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}