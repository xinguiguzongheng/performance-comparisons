package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_461 {
    private final Production31_461 production = new Production31_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}