package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_237 {
    private final Production65_237 production = new Production65_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}