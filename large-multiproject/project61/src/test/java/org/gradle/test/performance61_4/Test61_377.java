package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_377 {
    private final Production61_377 production = new Production61_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}