package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_356 {
    private final Production56_356 production = new Production56_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}