package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_373 {
    private final Production68_373 production = new Production68_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}