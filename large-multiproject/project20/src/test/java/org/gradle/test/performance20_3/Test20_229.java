package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_229 {
    private final Production20_229 production = new Production20_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}