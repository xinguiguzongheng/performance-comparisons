package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_256 {
    private final Production65_256 production = new Production65_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}