package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_55 {
    private final Production81_55 production = new Production81_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}