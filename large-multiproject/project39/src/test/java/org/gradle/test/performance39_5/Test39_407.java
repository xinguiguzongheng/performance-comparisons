package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_407 {
    private final Production39_407 production = new Production39_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}