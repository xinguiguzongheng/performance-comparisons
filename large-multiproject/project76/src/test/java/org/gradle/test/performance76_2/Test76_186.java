package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_186 {
    private final Production76_186 production = new Production76_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}