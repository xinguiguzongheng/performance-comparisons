package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_300 {
    private final Production98_300 production = new Production98_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}