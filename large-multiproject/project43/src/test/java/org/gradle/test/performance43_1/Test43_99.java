package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_99 {
    private final Production43_99 production = new Production43_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}