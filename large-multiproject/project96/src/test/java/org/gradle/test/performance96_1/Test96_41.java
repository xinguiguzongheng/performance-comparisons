package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_41 {
    private final Production96_41 production = new Production96_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}