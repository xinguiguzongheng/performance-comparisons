package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_38 {
    private final Production98_38 production = new Production98_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}