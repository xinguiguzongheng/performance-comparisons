package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_421 {
    private final Production72_421 production = new Production72_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}