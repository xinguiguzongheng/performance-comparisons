package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24993 {
    private final Productionnull_24993 production = new Productionnull_24993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}