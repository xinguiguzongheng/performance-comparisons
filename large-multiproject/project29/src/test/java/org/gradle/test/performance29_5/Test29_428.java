package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_428 {
    private final Production29_428 production = new Production29_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}