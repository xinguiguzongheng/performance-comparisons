package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42486 {
    private final Productionnull_42486 production = new Productionnull_42486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}