package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_253 {
    private final Production61_253 production = new Production61_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}