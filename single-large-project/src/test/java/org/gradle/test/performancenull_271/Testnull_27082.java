package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27082 {
    private final Productionnull_27082 production = new Productionnull_27082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}