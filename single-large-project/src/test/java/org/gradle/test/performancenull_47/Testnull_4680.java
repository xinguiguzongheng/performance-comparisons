package org.gradle.test.performancenull_47;

import static org.junit.Assert.*;

public class Testnull_4680 {
    private final Productionnull_4680 production = new Productionnull_4680("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}