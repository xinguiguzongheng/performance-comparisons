package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_146 {
    private final Production57_146 production = new Production57_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}