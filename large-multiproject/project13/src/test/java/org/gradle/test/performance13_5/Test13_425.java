package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_425 {
    private final Production13_425 production = new Production13_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}