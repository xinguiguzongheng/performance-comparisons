package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_405 {
    private final Production26_405 production = new Production26_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}