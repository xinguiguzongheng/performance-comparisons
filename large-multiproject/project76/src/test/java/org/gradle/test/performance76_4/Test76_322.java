package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_322 {
    private final Production76_322 production = new Production76_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}