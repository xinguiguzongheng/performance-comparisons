package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_146 {
    private final Production99_146 production = new Production99_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}