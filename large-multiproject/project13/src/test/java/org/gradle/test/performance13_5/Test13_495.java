package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_495 {
    private final Production13_495 production = new Production13_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}