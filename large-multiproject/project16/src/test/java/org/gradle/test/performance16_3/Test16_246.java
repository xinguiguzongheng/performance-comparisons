package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_246 {
    private final Production16_246 production = new Production16_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}