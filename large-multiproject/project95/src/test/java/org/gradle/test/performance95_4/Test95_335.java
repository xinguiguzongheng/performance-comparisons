package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_335 {
    private final Production95_335 production = new Production95_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}