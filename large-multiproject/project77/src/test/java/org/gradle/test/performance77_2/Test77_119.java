package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_119 {
    private final Production77_119 production = new Production77_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}