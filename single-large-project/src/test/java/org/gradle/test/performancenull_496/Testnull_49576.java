package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49576 {
    private final Productionnull_49576 production = new Productionnull_49576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}