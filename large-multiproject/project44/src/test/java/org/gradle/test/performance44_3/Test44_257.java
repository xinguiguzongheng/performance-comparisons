package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_257 {
    private final Production44_257 production = new Production44_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}