package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_2 {
    private final Production18_2 production = new Production18_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}