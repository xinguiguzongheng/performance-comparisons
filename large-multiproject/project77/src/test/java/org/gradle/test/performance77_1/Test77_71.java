package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_71 {
    private final Production77_71 production = new Production77_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}