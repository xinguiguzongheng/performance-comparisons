package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_263 {
    private final Production22_263 production = new Production22_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}