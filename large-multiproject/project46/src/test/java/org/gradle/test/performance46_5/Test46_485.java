package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_485 {
    private final Production46_485 production = new Production46_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}