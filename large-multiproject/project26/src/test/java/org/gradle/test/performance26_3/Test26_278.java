package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_278 {
    private final Production26_278 production = new Production26_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}