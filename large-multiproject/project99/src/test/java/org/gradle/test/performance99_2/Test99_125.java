package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_125 {
    private final Production99_125 production = new Production99_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}