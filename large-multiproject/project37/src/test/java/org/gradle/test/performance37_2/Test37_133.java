package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_133 {
    private final Production37_133 production = new Production37_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}