package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_345 {
    private final Production96_345 production = new Production96_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}