package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_319 {
    private final Production45_319 production = new Production45_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}