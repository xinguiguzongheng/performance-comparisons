package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_475 {
    private final Production98_475 production = new Production98_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}