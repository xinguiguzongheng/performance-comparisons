package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_214 {
    private final Production30_214 production = new Production30_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}