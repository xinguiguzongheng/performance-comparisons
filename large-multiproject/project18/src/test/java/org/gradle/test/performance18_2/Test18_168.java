package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_168 {
    private final Production18_168 production = new Production18_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}