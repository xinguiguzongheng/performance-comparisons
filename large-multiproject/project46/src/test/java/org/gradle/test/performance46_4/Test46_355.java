package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_355 {
    private final Production46_355 production = new Production46_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}