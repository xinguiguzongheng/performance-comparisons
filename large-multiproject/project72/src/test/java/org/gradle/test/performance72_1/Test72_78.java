package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_78 {
    private final Production72_78 production = new Production72_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}