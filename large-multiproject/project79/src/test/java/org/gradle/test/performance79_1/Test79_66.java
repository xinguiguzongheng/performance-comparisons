package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_66 {
    private final Production79_66 production = new Production79_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}