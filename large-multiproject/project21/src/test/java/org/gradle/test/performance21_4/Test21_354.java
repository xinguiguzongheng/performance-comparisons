package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_354 {
    private final Production21_354 production = new Production21_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}