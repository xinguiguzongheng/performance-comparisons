package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_142 {
    private final Production96_142 production = new Production96_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}