package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_372 {
    private final Production77_372 production = new Production77_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}