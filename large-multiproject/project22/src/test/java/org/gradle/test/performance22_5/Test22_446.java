package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_446 {
    private final Production22_446 production = new Production22_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}