package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_32 {
    private final Production57_32 production = new Production57_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}