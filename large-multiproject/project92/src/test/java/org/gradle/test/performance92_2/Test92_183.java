package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_183 {
    private final Production92_183 production = new Production92_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}