package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_371 {
    private final Production29_371 production = new Production29_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}