package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_345 {
    private final Production30_345 production = new Production30_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}