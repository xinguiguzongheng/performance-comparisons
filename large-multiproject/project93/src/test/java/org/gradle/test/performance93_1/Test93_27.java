package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_27 {
    private final Production93_27 production = new Production93_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}