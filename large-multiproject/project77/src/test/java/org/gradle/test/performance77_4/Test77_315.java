package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_315 {
    private final Production77_315 production = new Production77_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}