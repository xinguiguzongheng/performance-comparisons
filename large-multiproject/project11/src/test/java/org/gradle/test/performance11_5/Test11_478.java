package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_478 {
    private final Production11_478 production = new Production11_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}