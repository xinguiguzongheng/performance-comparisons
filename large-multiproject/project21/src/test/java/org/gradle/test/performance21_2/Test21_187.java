package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_187 {
    private final Production21_187 production = new Production21_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}