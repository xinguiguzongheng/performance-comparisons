package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_237 {
    private final Production85_237 production = new Production85_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}