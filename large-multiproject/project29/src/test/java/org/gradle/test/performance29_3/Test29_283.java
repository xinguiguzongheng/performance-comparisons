package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_283 {
    private final Production29_283 production = new Production29_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}