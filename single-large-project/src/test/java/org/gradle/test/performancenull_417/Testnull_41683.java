package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41683 {
    private final Productionnull_41683 production = new Productionnull_41683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}