package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_327 {
    private final Production45_327 production = new Production45_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}