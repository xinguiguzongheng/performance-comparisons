package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_173 {
    private final Production24_173 production = new Production24_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}