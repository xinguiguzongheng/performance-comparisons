package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10242 {
    private final Productionnull_10242 production = new Productionnull_10242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}