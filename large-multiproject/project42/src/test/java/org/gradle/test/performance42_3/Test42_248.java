package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_248 {
    private final Production42_248 production = new Production42_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}