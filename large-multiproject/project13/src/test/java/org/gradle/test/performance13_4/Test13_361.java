package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_361 {
    private final Production13_361 production = new Production13_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}