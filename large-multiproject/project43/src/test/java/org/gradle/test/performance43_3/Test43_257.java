package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_257 {
    private final Production43_257 production = new Production43_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}