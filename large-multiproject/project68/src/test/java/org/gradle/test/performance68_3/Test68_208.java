package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_208 {
    private final Production68_208 production = new Production68_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}