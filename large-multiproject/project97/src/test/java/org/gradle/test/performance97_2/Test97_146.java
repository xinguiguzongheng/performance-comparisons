package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_146 {
    private final Production97_146 production = new Production97_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}