package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_206 {
    private final Production33_206 production = new Production33_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}