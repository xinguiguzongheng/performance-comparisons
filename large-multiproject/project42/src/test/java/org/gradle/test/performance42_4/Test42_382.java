package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_382 {
    private final Production42_382 production = new Production42_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}