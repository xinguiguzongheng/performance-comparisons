package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_156 {
    private final Production42_156 production = new Production42_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}