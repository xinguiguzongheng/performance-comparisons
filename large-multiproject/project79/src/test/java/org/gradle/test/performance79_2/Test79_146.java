package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_146 {
    private final Production79_146 production = new Production79_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}