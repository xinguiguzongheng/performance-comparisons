package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_457 {
    private final Production63_457 production = new Production63_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}