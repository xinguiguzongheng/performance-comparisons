package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_255 {
    private final Production75_255 production = new Production75_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}