package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_33 {
    private final Production79_33 production = new Production79_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}