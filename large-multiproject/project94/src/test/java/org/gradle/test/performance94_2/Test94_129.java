package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_129 {
    private final Production94_129 production = new Production94_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}