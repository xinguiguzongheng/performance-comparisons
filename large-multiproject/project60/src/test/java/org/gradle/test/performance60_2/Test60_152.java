package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_152 {
    private final Production60_152 production = new Production60_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}