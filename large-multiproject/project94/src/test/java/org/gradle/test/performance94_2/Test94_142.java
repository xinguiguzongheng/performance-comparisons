package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_142 {
    private final Production94_142 production = new Production94_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}