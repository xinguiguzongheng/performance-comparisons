package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_135 {
    private final Production43_135 production = new Production43_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}