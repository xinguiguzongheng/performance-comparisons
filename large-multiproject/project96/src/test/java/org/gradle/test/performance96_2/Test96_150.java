package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_150 {
    private final Production96_150 production = new Production96_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}