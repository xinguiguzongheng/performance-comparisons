package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_65 {
    private final Production68_65 production = new Production68_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}