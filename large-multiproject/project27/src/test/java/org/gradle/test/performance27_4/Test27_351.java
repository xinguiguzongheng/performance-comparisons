package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_351 {
    private final Production27_351 production = new Production27_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}