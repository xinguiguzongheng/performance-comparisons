package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_381 {
    private final Production42_381 production = new Production42_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}