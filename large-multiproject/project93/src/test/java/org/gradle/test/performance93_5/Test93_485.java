package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_485 {
    private final Production93_485 production = new Production93_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}