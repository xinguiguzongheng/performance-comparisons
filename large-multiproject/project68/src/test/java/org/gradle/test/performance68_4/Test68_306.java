package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_306 {
    private final Production68_306 production = new Production68_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}