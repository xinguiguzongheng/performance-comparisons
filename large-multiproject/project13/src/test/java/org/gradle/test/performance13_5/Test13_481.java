package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_481 {
    private final Production13_481 production = new Production13_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}