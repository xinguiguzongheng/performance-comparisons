package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_412 {
    private final Production99_412 production = new Production99_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}