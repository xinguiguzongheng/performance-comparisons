package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_468 {
    private final Production39_468 production = new Production39_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}