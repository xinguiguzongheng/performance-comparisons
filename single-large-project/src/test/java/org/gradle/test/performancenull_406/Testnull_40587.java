package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40587 {
    private final Productionnull_40587 production = new Productionnull_40587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}