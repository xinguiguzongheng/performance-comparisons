package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_208 {
    private final Production72_208 production = new Production72_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}