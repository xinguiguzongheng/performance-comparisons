package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_242 {
    private final Production35_242 production = new Production35_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}