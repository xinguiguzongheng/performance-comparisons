package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_107 {
    private final Production43_107 production = new Production43_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}