package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_134 {
    private final Production68_134 production = new Production68_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}