package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_10 {
    private final Production22_10 production = new Production22_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}