package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_54 {
    private final Production76_54 production = new Production76_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}