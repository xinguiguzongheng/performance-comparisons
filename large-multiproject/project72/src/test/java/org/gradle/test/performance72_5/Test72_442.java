package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_442 {
    private final Production72_442 production = new Production72_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}