package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_295 {
    private final Production74_295 production = new Production74_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}