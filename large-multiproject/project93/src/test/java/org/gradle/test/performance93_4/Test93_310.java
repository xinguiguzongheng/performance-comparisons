package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_310 {
    private final Production93_310 production = new Production93_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}