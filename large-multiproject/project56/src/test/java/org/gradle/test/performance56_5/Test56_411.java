package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_411 {
    private final Production56_411 production = new Production56_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}