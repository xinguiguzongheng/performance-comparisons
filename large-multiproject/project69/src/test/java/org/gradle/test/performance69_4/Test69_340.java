package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_340 {
    private final Production69_340 production = new Production69_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}