package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_385 {
    private final Production72_385 production = new Production72_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}