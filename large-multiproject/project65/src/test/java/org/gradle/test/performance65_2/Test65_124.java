package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_124 {
    private final Production65_124 production = new Production65_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}