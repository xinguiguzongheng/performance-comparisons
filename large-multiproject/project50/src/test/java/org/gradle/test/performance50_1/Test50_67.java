package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_67 {
    private final Production50_67 production = new Production50_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}