package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_288 {
    private final Production75_288 production = new Production75_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}