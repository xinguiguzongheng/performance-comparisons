package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_3 {
    private final Production30_3 production = new Production30_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}