package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_302 {
    private final Production16_302 production = new Production16_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}