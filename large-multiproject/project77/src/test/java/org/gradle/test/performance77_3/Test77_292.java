package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_292 {
    private final Production77_292 production = new Production77_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}