package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_486 {
    private final Production21_486 production = new Production21_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}