package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_287 {
    private final Production79_287 production = new Production79_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}