package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_46 {
    private final Production29_46 production = new Production29_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}