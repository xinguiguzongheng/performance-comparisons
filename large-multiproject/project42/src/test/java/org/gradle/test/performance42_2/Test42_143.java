package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_143 {
    private final Production42_143 production = new Production42_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}