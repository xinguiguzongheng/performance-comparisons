package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_469 {
    private final Production16_469 production = new Production16_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}