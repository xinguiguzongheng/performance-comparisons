package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_375 {
    private final Production69_375 production = new Production69_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}