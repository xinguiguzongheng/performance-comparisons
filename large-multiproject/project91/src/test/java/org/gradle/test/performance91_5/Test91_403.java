package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_403 {
    private final Production91_403 production = new Production91_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}