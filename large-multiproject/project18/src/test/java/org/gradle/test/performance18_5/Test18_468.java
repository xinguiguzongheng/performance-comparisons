package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_468 {
    private final Production18_468 production = new Production18_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}