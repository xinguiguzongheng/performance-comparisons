package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_152 {
    private final Production69_152 production = new Production69_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}