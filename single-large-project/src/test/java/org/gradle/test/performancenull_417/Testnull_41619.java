package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41619 {
    private final Productionnull_41619 production = new Productionnull_41619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}