package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_333 {
    private final Production61_333 production = new Production61_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}