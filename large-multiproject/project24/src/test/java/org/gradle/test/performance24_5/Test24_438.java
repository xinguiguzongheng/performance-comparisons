package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_438 {
    private final Production24_438 production = new Production24_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}