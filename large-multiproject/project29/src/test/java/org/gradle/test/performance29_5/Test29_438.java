package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_438 {
    private final Production29_438 production = new Production29_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}