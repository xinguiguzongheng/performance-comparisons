package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_249 {
    private final Production50_249 production = new Production50_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}