package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20426 {
    private final Productionnull_20426 production = new Productionnull_20426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}