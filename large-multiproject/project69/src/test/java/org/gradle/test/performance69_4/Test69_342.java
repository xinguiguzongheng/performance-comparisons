package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_342 {
    private final Production69_342 production = new Production69_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}