package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_198 {
    private final Production99_198 production = new Production99_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}