package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_32 {
    private final Production91_32 production = new Production91_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}