package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_273 {
    private final Production60_273 production = new Production60_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}