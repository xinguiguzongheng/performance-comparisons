package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_467 {
    private final Production95_467 production = new Production95_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}