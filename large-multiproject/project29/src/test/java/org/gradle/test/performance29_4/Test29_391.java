package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_391 {
    private final Production29_391 production = new Production29_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}