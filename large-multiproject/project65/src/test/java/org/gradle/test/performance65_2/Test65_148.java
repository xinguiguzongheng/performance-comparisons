package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_148 {
    private final Production65_148 production = new Production65_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}