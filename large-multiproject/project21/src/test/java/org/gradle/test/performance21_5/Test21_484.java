package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_484 {
    private final Production21_484 production = new Production21_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}