package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_274 {
    private final Production99_274 production = new Production99_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}