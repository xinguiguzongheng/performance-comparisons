package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36070 {
    private final Productionnull_36070 production = new Productionnull_36070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}