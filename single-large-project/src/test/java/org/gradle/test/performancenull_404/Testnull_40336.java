package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40336 {
    private final Productionnull_40336 production = new Productionnull_40336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}