package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_320 {
    private final Production20_320 production = new Production20_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}