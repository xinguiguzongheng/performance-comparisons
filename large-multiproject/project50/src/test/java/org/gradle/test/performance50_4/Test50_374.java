package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_374 {
    private final Production50_374 production = new Production50_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}