package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_62 {
    private final Production98_62 production = new Production98_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}