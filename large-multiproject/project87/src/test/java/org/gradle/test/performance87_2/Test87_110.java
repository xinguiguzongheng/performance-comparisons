package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_110 {
    private final Production87_110 production = new Production87_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}