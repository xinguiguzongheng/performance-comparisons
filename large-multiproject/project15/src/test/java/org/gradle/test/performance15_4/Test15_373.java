package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_373 {
    private final Production15_373 production = new Production15_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}