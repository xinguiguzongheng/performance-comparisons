package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_236 {
    private final Production60_236 production = new Production60_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}