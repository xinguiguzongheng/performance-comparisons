package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_397 {
    private final Production68_397 production = new Production68_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}