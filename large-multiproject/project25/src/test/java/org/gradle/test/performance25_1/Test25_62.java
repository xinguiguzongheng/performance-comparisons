package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_62 {
    private final Production25_62 production = new Production25_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}